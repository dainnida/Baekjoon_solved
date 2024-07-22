N, M = map(int, input().split())
# arr = [0 for i in range(N)]
arr = [0] * N

for a in range(M):
    i, j, k = map(int, input().split())
    for b in range(i, j+1):
        arr[b-1] = k

print(*arr)