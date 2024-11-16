import sys
input = sys.stdin.readline

A = []
B = []

N, M = map(int, input().split())
for _ in range(N):
    A.append(list(map(int, input().split())))

M, K = map(int, input().split())
for _ in range(M):
    B.append(list(map(int, input().split())))

for i in range(N):
    for j in range(K):
        tmp = 0
        for k in range(M):
            tmp += A[i][k] * B[k][j]
        print(tmp, end=' ')
    print()