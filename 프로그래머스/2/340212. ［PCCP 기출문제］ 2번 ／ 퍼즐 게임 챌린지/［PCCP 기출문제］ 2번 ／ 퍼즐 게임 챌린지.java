class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int left = 1; // 첫 번째는 무조건 해결해야 함
        int right = 100000;
        
        while (left <= right) {
            int level = (left + right) / 2;
            long currLimit = 0;
            
            // 해당 mid에서의 걸리는 시간 계산
            for (int i = 0; i < diffs.length; i++) {
                if (diffs[i] <= level)
                    currLimit += times[i];
                else 
                    currLimit += (diffs[i] - level) * (times[i] + times[i-1]) + times[i];
            }
            
            // 걸린 시간이 limit 이내인지 확인
            if (currLimit <= limit) {
                right = level - 1;
                answer = level;
            }
            else
                left = level + 1;
        }
        
        return answer;
    }
}