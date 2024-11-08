import sys
input = sys.stdin.readline

N, K = map(int, input().split())
coin = []
cnt = 0

for _ in range(N):
    coin.append(int(input()))
coin.reverse()

for i in coin:
    if K >= i:
        cnt += K // i
        K %= i

print(cnt)