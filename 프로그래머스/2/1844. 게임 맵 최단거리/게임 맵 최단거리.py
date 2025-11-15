from collections import deque

def solution(maps):
    n, m = len(maps), len(maps[0])
    
    if maps[0][0] == 0 or maps[n-1][m-1] == 0:
        return -1
    
    dp = [[0] * m for _ in range(n)]
    dp[0][0] = 1
    
    dirt = [(1, 0), (-1, 0), (0, 1), (0, -1) ]    
    q = deque()
    q.append((0, 0))
    
    while q:
        x, y = q.popleft()
        
        if x==n-1 and y==m-1:
            return dp[x][y]
        
        for dx, dy in dirt:
            nx, ny = x+dx, y+dy
            if 0<=nx<n and 0<=ny<m and maps[nx][ny]==1:
                if dp[nx][ny] == 0:
                    dp[nx][ny] = dp[x][y]+1
                    q.append((nx, ny))
                    
    return -1