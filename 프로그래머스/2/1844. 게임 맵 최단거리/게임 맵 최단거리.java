import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] dp = new int[n][m];
        int[][] dirt = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        Deque<int[]> q = new ArrayDeque<>();
        
        q.offer(new int[]{0, 0});
        dp[0][0] = 1;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0], y = curr[1];
            for (int[] next : dirt) {
                int dx = x + next[0], dy = y + next[1];
                if (0 <= dx && dx < n && 0 <= dy && dy < m && maps[dx][dy] != 0 && dp[dx][dy] == 0) {
                    q.offer(new int[]{dx, dy});
                    dp[dx][dy] = dp[x][y] + 1;
                }
            }
        }
        int answer = dp[n-1][m-1];
        return answer == 0 ? -1 : answer;
    }
}