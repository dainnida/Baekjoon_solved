N, M = map(int, input().split())
arr = [i+1 for i in range(N)]

for i in range(M):
    a, b = map(int, input().split())
    temp = arr[a-1:b]
    arr[a-1:b] = temp[::-1]

print(*arr)