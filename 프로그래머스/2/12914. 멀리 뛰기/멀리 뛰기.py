def solution(n):
    answer = 0
    dp = [0, 1, 2, 3]
    for i in range(4, n+1):
        dp.append(dp[i-1] + dp[i-2])
    return dp[n] % 1234567