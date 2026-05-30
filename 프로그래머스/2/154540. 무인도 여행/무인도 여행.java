import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        List<Integer> answer = new ArrayList<>();
        int n = maps.length, m = maps[0].length();
        boolean[][] visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i].charAt(j) != 'X' && !visited[i][j]) {
                    visited[i][j] = true;
                    answer.add(bfs(i, j, maps, visited));
                }
            }
        }
        
        if (answer.isEmpty())
            return new int[]{-1};
        
        Collections.sort(answer);
        return answer.stream().mapToInt(i->i).toArray();
    }
    
    public int bfs(int x, int y, String[] maps, boolean[][] visited) {
        Deque<int[]> q = new ArrayDeque<>();
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        int food = 0;
        
        q.offer(new int[]{x, y});
        visited[x][y] = true;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int cx = curr[0], cy = curr[1];
            food += maps[cx].charAt(cy) - '0';
            
            for (int[] dir : dirs) {
                int nx = cx + dir[0], ny = cy + dir[1];
                if (nx >= 0 && nx < maps.length&& ny >= 0 && ny < maps[0].length()
                    && maps[nx].charAt(ny) != 'X' && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        
        return food;
    }
}