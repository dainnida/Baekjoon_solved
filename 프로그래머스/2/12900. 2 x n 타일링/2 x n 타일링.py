import math

def solution(n):
#     dp = [0] * (n+1)
#     dp[1] = 1 # 세로만
#     dp[2] = 2 # 세로2 or 가로만
    
#     for i in range(3, n+1):
#         dp[i] = (dp[i-2] + dp[i-1]) % 1000000007 # dp[i-2]에 세로 2개 붙이거나 가로 1개 붙이기 or dp[i-1]에 세로 1개 붙이기
            
#     return dp[n]
    a, b = 1, 2
    for i in range(3, n+1):
        a, b = b, (a+b) % 1000000007
    return b