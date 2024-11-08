import sys
input = sys.stdin.readline

N, K = map(int, input().split())
coin = []
cnt = 0

for _ in range(N):
    coin.append(int(input()))

for i in range(N-1, -1, -1):
    if K >= coin[i]:
        cnt += K // coin[i]
        K %= coin[i]

print(cnt)