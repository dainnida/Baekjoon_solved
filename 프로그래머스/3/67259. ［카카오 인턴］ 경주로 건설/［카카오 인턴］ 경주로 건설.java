import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = Integer.MAX_VALUE;
        int n = board.length;
        // [x, y, 현재 비용, 방향]
        Deque<int[]> q = new ArrayDeque<>();
        // [x, y, 방향]까지 도달할 때의 비용
        int[][][] cost = new int[n][n][4];
        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; // 아래, 오, 위, 왼
        
        if (board[0][1] == 0) {
            q.offer(new int[]{0, 1, 100, 1});
            cost[0][1][1] = 100;
        }
        if (board[1][0] == 0) {
            q.offer(new int[]{1, 0, 100, 0});
            cost[1][0][0] = 100;
        }
        
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int cx = curr[0], cy = curr[1];
            int currCost = curr[2];
            int currDir = curr[3];
            
            if (cx == n-1 && cy == n-1) {
                answer = Math.min(answer, currCost);
                continue;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dir[i][0], ny = cy + dir[i][1];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 0) {
                    int nextCost = currCost + (currDir == i ? 100 : 600);
                    if (cost[nx][ny][i] == 0 || cost[nx][ny][i] > nextCost) {
                        cost[nx][ny][i] = nextCost;
                        q.offer(new int[]{nx, ny, nextCost, i});
                    }
                }
            }
        }
        
        return answer;
    }
}