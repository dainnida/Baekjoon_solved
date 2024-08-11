# N, M = map(int, input().split())
# lst = []

# for _ in range(2):
#     for i in range(N):
#         lst.append(list(map(int, input().split())))

# for i in range(N):
#     for j in range(M):
#         print(lst[i][j] + lst[i+N][j], end=' ')
#     print()

N, M = map(int, input().split())
lst = []

for i in range(N):
    lst.append(list(map(int, input().split())))

for i in range(N):
    second_lst = list(map(int, input().split()))
    for j in range(M):
        lst[i][j] += second_lst[j]

for row in lst:
    print(*row)
