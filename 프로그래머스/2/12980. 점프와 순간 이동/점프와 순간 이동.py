def solution(n):
#     dp = [0, 1, 1] # index거리를 이동할 때 최소 건전지 사용량
#     for i in range(3, n+1):
#         if i % 2 == 0:
#             dp.append(dp[i//2])
#         else:
#             dp.append(dp[i-1]+1)

#     return dp[n]
    ans = 0
    while(n>2):
        if (n % 2 == 0):
            n //= 2
        else:
            ans += 1
            n -= 1
    return ans+1