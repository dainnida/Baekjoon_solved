import sys
input = sys.stdin.readline

N, M = map(int, input().split())
num = list(map(int, input().split()))
sum = [0]

for i in range(1, N+1):
    sum.append(sum[i-1]+num[i-1])

for _ in range(M):
    i, j = map(int, input().split())
    print(sum[j]-sum[i-1])