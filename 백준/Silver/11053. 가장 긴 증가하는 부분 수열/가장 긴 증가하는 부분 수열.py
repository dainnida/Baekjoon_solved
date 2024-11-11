import sys
input = sys.stdin.readline

N = int(input())
lst = list(map(int, input().split()))
DP = [1] * N

for i in range(N):
    for j in range(i):
        if lst[i] > lst[j]:
            DP[i] = max(DP[i], DP[j]+1)

print(max(DP))