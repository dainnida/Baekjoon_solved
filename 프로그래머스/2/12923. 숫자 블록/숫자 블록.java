class Solution {
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int) (end - begin + 1)];
        
        for (long i = begin; i <= end; i++) {
            int index = (int) (i - begin);
        
            if (i == 1) {
                answer[0] = 0;
                continue;
            }
            
            for (long j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    if (i / j <= 10000000) { // 블록의 최대는 10,000,000
                        answer[index] = (int) (i / j);
                        break;
                    }
                    else {
                        answer[index] = (int) j; // i가 매우 큰 수라면 더 작은 약수쪽이 정답일 수 있음
                    }
                }
            }
            if (answer[index] == 0) // 소수라면 한 번도 나누어지지 않음
                answer[index] = 1;
        }
        
        return answer;
    }
}