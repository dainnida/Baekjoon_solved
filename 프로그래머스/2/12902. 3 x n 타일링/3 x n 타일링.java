class Solution {
    public int solution(int n) {
        long[] dp = new long[n + 1];
        dp[2] = 3;
        
        for (int i = 4; i <= n; i += 2) {
            long count = 0;
            // f(n) = f(n-2)*f(2) + f(n-4)*2 + f(n-6)*2 + ... + f(2)*2 + 2 
            count += dp[i - 2] * dp[2] + 2; // f(n-2)*f(2) + 2
            
            for (int j = 2; j <= i - 4; j += 2)
                count += dp[j] * 2; // 나머지
            
            dp[i] = (int) (count % 1000000007);
        }
        
        return (int) dp[n];
    }
}