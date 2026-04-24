import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        int sx = -1, sy = -1, ex = -1, ey = -1, lx = -1, ly = -1;
        Queue<int[]> q = new ArrayDeque<>();
        int[][] dirt = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        int[][][] dp = new int[n][m][2]; // 마지막은 L 방문 여부 - 0:방문X, 1:방문O
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
        q.offer(new int[]{sx, sy});
        dp[sx][sy][0] = 0;
        while (!q.isEmpty()) { // S -> L
            int[] curr = q.poll();
            int x = curr[0], y = curr[1];
            for (int[] next : dirt) {
                int dx = x + next[0], dy = y + next[1];
                if (dx == lx && dy == ly) {
                    dp[lx][ly][1] = dp[x][y][0] + 1;
                    q.clear();
                    break;
                }
                if (0 <= dx && dx < n && 0 <= dy && dy < m && boards[dx][dy] != 0 && dp[dx][dy][0] == 0) {
                    dp[dx][dy][0] = dp[x][y][0] + 1;
                    q.offer(new int[]{dx, dy});
                }
            }
        }
        if (dp[lx][ly][1] == 0)
            return -1;
        q.offer(new int[]{lx, ly});
        while (!q.isEmpty()) { // L -> E
            int[] curr = q.poll();
            int x = curr[0], y = curr[1];
            for (int[] next : dirt) {
                int dx = x + next[0], dy = y + next[1];
                if (dx == ex && dy == ey) {
                    dp[ex][ey][1] = dp[x][y][1] + 1;
                    q.clear();
                    break;
                }
                if (0 <= dx && dx < n && 0 <= dy && dy < m && boards[dx][dy] != 0 && dp[dx][dy][1] == 0) {
                    dp[dx][dy][1] = dp[x][y][1] + 1;
                    q.offer(new int[]{dx, dy});
                }
            }
        }
        int answer = dp[ex][ey][1];
        return answer == 0 ? -1 : answer;
    }
}