import sys
input = sys.stdin.readline

n = int(input())
stair = []
for i in range(n):
    stair.append(int(input()))

if n<=2:
    print(sum(stair))
else:
    DP = [stair[0], stair[0]+stair[1]] # 첫째 줄 계단은 무조건, 둘째 줄 계단은 1->2가 시작->2보다 큼
    DP.append(max(stair[0]+stair[2], stair[1]+stair[2])) # 셋째 줄은 1->3 혹은 2->3
    for i in range(3, n):
        DP.append(max(DP[i-3] + stair[i-1], DP[i-2]) + stair[i])

    print(DP[n-1])