def solution(m, n, board):
    answer = 0
    board = [list(b) for b in board]
    delete = {0}
    n, m = len(board[0]), len(board)
    
    while delete: # 지울 게 없을 때까지 반복
        delete = set()
        for x in range(m-1):
            for y in range(n-1):
                if board[x][y] != 0 and board[x][y] == board[x][y+1] == board[x+1][y] == board[x+1][y+1]:
                    delete.add((x, y))
                    delete.add((x, y+1))
                    delete.add((x+1, y))
                    delete.add((x+1, y+1))
        # 빈 공간 만들기
        for a, b in delete:
            board[a][b] = 0
        # 블럭 아래로 떨어뜨리기
        for y in range(n):
            block = [board[x][y] for x in range(m) if board[x][y] != 0] # 열 기준
            column = [0]*(m-len(block)) + block
            for x in range(m):
                board[x][y] = column[x]            
    return sum(row.count(0) for row in board)