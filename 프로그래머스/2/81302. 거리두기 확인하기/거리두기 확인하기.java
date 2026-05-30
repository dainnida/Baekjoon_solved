import java.util.*;

class Solution {
    int[][] dirs = new int[][]{{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        Arrays.fill(answer, 1);
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (places[i][j].charAt(k) == 'P') {
                        boolean[][] visited = new boolean[5][5];
                        visited[j][k] = true;
                        // 규칙 지키지 않음, [시작 x, 시작 y, 현재 x, 현재, y]
                        if (!dfs(j, k, j, k, places[i], visited))
                            answer[i] = 0;
                    }  
                }
            }
        }
        
        return answer;
    }
    
    public boolean dfs(int startX, int startY, int cx, int cy, String[] board, boolean[][] visited) {
        
        int manhattan = Math.abs(cx - startX) + Math.abs(cy - startY);
        
        // 맨해튼 거리가 2 초과면 모두 만족한 것
        if (manhattan > 2)
            return true;
        // 맨해튼 거리가 2이하인데 응시자를 만남(시작점 제외)
        if (manhattan > 0 && board[cx].charAt(cy) == 'P')
            return false;

        for (int[] dir : dirs) {
            int nx = cx + dir[0], ny = cy + dir[1];
            if (nx >=0 && nx < 5 && ny >= 0 && ny < 5
                && !visited[nx][ny] && board[nx].charAt(ny) != 'X') {
                    visited[nx][ny] = true;
                    if (!dfs(startX, startY, nx, ny, board, visited))
                        return false;
            }
        }
        return true;
    }
}