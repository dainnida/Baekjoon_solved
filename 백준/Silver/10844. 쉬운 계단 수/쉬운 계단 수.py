import sys
input = sys.stdin.readline

N = int(input())
DP = [[0] * 10 for _ in range(N+1)] # DP[자릿수][맨 뒷자리의 수]
DP[1] = [1 for _ in range(10)]
DP[1][0] = 0 # 1자리의 수에는 0 없음

for i in range(2, N+1):
    DP[i][0] = DP[i-1][1]
    DP[i][9] = DP[i-1][8]
    for j in range(1, 9):
        DP[i][j] = DP[i-1][j-1] + DP[i-1][j+1]

print(sum(DP[N]) % 1000000000)