import java.util.*;

class Solution {
    public int solution(String[] board) {
        int answer = 0;
        int n = board.length, m = board[0].length();
        // [x, y, 움직인 횟수]
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        boolean[][] barrier = new boolean[n][m];
        int startX = -1, startY = -1;
        int goalX = -1, goalY = -1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == 'R') {
                    startX = i; startY = j;
                }
                else if (board[i].charAt(j) == 'G') {
                    goalX = i; goalY = j;
                }
                else if (board[i].charAt(j) == 'D')
                    barrier[i][j] = true;
            }
        }
        
        q.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            int currX = curr[0], currY = curr[1], currLen = curr[2];
            
            for (int[] dir : dirs) {
                int nextX = currX;
                int nextY = currY;
                // 장애물이나 가장자리에 부딪힐 때까지
                while (nextX + dir[0] >= 0 && nextX + dir[0] < n && nextY + dir[1] >= 0 && nextY + dir[1] < m && !barrier[nextX + dir[0]][nextY + dir[1]]) {
                        nextX += dir[0];
                        nextY += dir[1];
                }
                // 목표 지점이면
                if (nextX == goalX && nextY == goalY)
                    return currLen + 1;
                
                // 방문한 적 없어야 함
                if (!visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    q.offer(new int[]{nextX, nextY, currLen + 1});
                }
                
            }
        }
        
        return -1;
    }
}