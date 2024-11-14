import sys
input = sys.stdin.readline

N = int(input())
road = list(map(int, input().split()))
oil = list(map(int, input().split()))

res = road[0] * oil[0]
min = oil[0]
for i in range(1, N-1):
    if min > oil[i]:
        min = oil[i]
    res += min * road[i]

print(res)