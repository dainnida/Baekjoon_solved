import sys
input = sys.stdin.readline

M, N, K = map(int, input().split())
board = [[0]*N for _ in range(M)]
answer = []

for _ in range(K):
    x1, y1, x2, y2 = map(int, input().split())
    for y in range(y1, y2):
        for x in range(x1, x2):
            board[y][x] = 1

move = [[1,0], [-1,0], [0,1], [0,-1]]
def dfs(x, y):
    board[y][x] = 1
    area = 1
    stack = [(x, y)]

    while stack:
        x, y = stack.pop()
        for nx, ny in move:
            nx, ny = x+nx, y+ny
            if 0 <= nx < N and 0 <= ny < M and board[ny][nx]==0:
                board[ny][nx] = 1
                area += 1
                stack.append((nx, ny))
    return area

for y in range(M):
    for x in range(N):
        if board[y][x] == 0:
            answer.append(dfs(x,y))

answer.sort()
print(len(answer))
print(*answer)