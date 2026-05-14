class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            long number = numbers[i];
            
            if (number % 2 == 0) // 마지막 비트가 0이면 걔만 1로 바꾸면 끝
                answer[i] = number + 1;
            else {
                // 가장 오른쪽에 나온 0만 1로 바꾸기
                long lastZero = ~number & (number + 1);
                answer[i] = number + (lastZero >> 1);
            }
        }
        return answer;
    }
}