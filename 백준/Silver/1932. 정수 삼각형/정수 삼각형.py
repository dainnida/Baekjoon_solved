import sys
input = sys.stdin.readline

n = int(input())
tri = [0] * n

for i in range(n):
    tri[i] = (list(map(int, input().split())))

for i in range(1, n):
    tri[i][0] += tri[i-1][0]
    for j in range(1, len(tri[i])-1):
        tri[i][j] += max(tri[i-1][j-1], tri[i-1][j])
    tri[i][len(tri[i])-1] += tri[i-1][len(tri[i-1])-1]

print(max(tri[n-1]))