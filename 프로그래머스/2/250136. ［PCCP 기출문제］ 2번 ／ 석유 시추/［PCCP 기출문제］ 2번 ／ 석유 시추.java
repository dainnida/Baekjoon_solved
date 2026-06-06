import java.util.*;

class Solution {
    public int solution(int[][] land) {
        int answer = 0;
        int n = land.length, m = land[0].length;
        // [방문한 x좌표, 방문한 y좌표]
        Deque<int[]> q;
        // 몇 번 오일 덩어리인지 저장 -> 불필요한 계산 줄임
        int[][] oilNum = new int[n][m];
        // i번 오일 덩어리의 크기를 저장하는 리스트 (번호는 1부터 시작)
        List<Integer> oilLand = new ArrayList<>();
        oilLand.add(0);
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        
        for (int j = 0; j < m; j++) {
            // 해당 열에서 만난 오일 덩어리의 번호들을 저장해 놓음 (oils에 갱신한 건지 확인하기 위해)
            Set<Integer> discovered = new HashSet<>();
            
            for (int i = 0; i < n; i++) {
                if (land[i][j] == 1 && oilNum[i][j] == 0) { // 석유 발견했고 아직 방문 안 함
                    // 해당 오일 덩어리 번호
                    int num = oilLand.size();
                    // 해당 오일 덩어리의 크기를 저장할 변수
                    int count = 0;
                    
                    // 큐 초기화
                    q = new ArrayDeque<>();
                    
                    q.offer(new int[]{i, j});
                    oilNum[i][j] = num;
                    count++;
                    
                    while (!q.isEmpty()) {
                        int[] curr = q.poll();
                        int cx = curr[0], cy = curr[1];
                        
                        for (int[] dir : dirs) {
                            int nx = cx + dir[0], ny = cy + dir[1];
                            // 범위 안이고 석유인데 방문한 적 없음(오일 번호가 있으면 이미 방문한 것)
                            if (nx >= 0 && nx < n && ny >= 0 && ny < m && land[nx][ny] == 1 && oilNum[nx][ny] == 0) {
                                oilNum[nx][ny] = num;
                                count++;
                                q.offer(new int[]{nx, ny});
                            }
                        }
                    }
                    // 새로 발견한 오일 정보 저장
                    oilLand.add(count);
                    discovered.add(num);
                }
                else if (land[i][j] == 1 && oilNum[i][j] != 0) // 석유 발견했고 이미 크기 계산 완료 (같은 열에서 방문한 오일 덩어리라도 set이라 중복 제거됨)
                    discovered.add(oilNum[i][j]);
            }
            
            // 오일 덩어리들의 합 구하기
            int oilSum = 0;
            for (int d : discovered) {
                oilSum += oilLand.get(d);
            }
            
            // 가장 큰 덩어리의 합으로 갱신
            answer = Math.max(answer, oilSum);
        }
        
        return answer;
    }
}