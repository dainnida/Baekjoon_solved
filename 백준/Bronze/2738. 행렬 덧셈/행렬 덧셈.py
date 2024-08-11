N, M = map(int, input().split())
lst = []

for _ in range(2):
    for i in range(N):
        lst.append(list(map(int, input().split())))

for i in range(N):
    for j in range(M):
        print(lst[i][j] + lst[i+N][j], end=' ')
    print()