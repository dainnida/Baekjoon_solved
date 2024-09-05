N, M = map(int, input().split())
board = []
result = 64

for i in range(N):
    board.append(list(input()))

for i in range(N-7):
    for j in range(M-7):
        countW = 0 # 좌상단이 W인 경우
        countB = 0 # 좌상단이 B인 경우
        for a in range(i, i+8):
            for b in range(j, j+8):
                if (a + b) % 2 == 0:
                    if board[a][b] != 'W':
                        countW += 1
                    if board[a][b] != 'B':
                        countB += 1
                else:
                    if board[a][b] == 'W':
                        countW += 1
                    if board[a][b] == 'B':
                        countB += 1
        result = min(result, countW, countB)

print(result)
