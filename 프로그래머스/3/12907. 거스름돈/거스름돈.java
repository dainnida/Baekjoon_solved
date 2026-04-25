class Solution {
    public int solution(int n, int[] money) {
        int[] dp = new int[n+1];
        for (int m: money) {
            dp[m] += 1;
            for (int i = m + 1; i <= n; i++)
                dp[i] = (dp[i] + dp[i-m]) % 1000000007;
        }
        return dp[n];
    }
}