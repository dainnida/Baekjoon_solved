N, M = map(int, input().split())
arr = []
for a in range(N):
    arr.append(a+1)

for a in range(M):
    i, j = map(int, input().split())
    arr[i-1], arr[j-1] = arr[j-1], arr[i-1]

print(*arr)