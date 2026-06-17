import java.util.*;

class Solution {
    public int solution(String[] storage, String[] requests) {
        int answer = 0;
        int n = storage.length, m = storage[0].length();
        // BFS 시 사용할 큐 ([x좌표, y좌표])
        Deque<int[]> q = new ArrayDeque<>();
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {0, -1}, {-1, 0}};

        // 컨테이너(storage)를 2차원 배열로 변경
        char[][] containers = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                containers[i][j] = storage[i].charAt(j);
        }
        
        for (String request : requests) {
            char target = request.charAt(0);
            
            // 크레인 이용 = 모든 컨테이너 꺼냄
            if (request.length() > 1) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (containers[i][j] == target)
                            containers[i][j] = '.';
                    }
                }
            }
            // 지게차 사용 = 접근 가능한 컨테이너만 꺼냄
            // = 접근 가능 즉, 외부랑 연결되어 있는지 확인하기 위해 BFS 사용
            else {
                // 한꺼번에 지워야 하므로 저장해놓기
                List<int[]> deletedList = new ArrayList<>();
                // BFS 시 사용할 방문저장 배열
                boolean[][] visited = new boolean[n][m];
                
                // 테두리에서 진입 가능한 곳을 시작으로 타고 가서 살펴보기
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                            if (containers[i][j] == target) {
                                deletedList.add(new int[]{i, j});
                                visited[i][j] = true;
                            }
                            else if (containers[i][j] == '.') {
                                q.offer(new int[]{i, j});
                                visited[i][j] = true;
                            }
                        }
                    }
                }
                
                // 진입 가능한 곳 계속 가서 해당 컨테이너 있는지 확인
                while (!q.isEmpty()) {
                    int[] curr = q.poll();
                    int cx = curr[0], cy = curr[1];
                    
                    for (int[] dir : dirs) {
                        int nx = cx + dir[0], ny = cy + dir[1];
                        
                        if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]) {
                            visited[nx][ny] = true;
                            
                            if (containers[nx][ny] == target) 
                                deletedList.add(new int[]{nx, ny});
                            else if (containers[nx][ny] == '.')
                                q.offer(new int[]{nx, ny});
                            
                        }
                    }
                }
                // 한 번에 지게차로 꺼내기
                for (int[] d : deletedList) 
                    containers[d[0]][d[1]] = '.';
            }
        }
        
        // 남은 컨테이너 계산하기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (containers[i][j] != '.')
                    answer++;
            }
        }
        
        return answer;
    }
}