import math

N, M = map(int, input().split())
arr = [i+1 for i in range(N)]

for i in range(M):
    a, b = map(int, input().split())
    for i in range(a, math.ceil((a+b)/2)):
        arr[i-1], arr[a+b-i-1] = arr[a+b-i-1], arr[i-1]

print(*arr)