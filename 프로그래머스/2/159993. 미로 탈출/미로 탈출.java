import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        int sx = -1, sy = -1, ex = -1, ey = -1, lx = -1, ly = -1;
        int[][] boards = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i].charAt(j) == 'X')
                    boards[i][j] = 0;
                else {
                    boards[i][j] = 1;
                    if (maps[i].charAt(j) == 'S') {
                        sx = i; sy = j;
                    }
                    else if (maps[i].charAt(j) == 'E') {
                        ex = i; ey = j;
                    }
                    else if (maps[i].charAt(j) == 'L') {
                        lx = i; ly = j;
                    }
                }
            }
        }
        int timeSL = bfs(sx, sy, lx, ly, n, m, boards);
        if (timeSL == -1)
            return -1;
        
        int timeLE = bfs(lx, ly, ex, ey, n, m, boards);
        return timeLE == -1 ? -1 : timeSL + timeLE;
    }
    
    public static int bfs(int startX, int startY, int targetX, int targetY, int n, int m, int[][] boards) {
        Queue<int[]> q = new ArrayDeque<>();
        int[][] dirt = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        int[][] dp = new int[n][m];
        
        q.offer(new int[]{startX, startY});
        dp[startX][startY] = 0;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0], y = curr[1];
            for (int[] next : dirt) {
                int dx = x + next[0], dy = y + next[1];
                if (dx == targetX && dy == targetY) {
                    dp[targetX][targetY] = dp[x][y] + 1;
                    return dp[targetX][targetY];
                }
                if (0 <= dx && dx < n && 0 <= dy && dy < m && boards[dx][dy] != 0 && dp[dx][dy] == 0) {
                    dp[dx][dy] = dp[x][y] + 1;
                    q.offer(new int[]{dx, dy});
                }
            }
        }
        return -1;
    }
}