class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        long longK = (long) k, longD = (long) d;
        
        for (long i = 0; i <= longD; i += longK) {
            long j = (long) Math.sqrt(longD*longD - i*i);
            answer += j / k + 1; // 1은 j = 0까지 포함
        }
        
        return answer;
    }
}