import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        
        // -1 : 결과 모름, 1: 이김, 0: 짐
        int[][] matches = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(matches[i], -1);
        }
        
        for (int[] result: results) {
            int winner = result[0] - 1; // 인덱스로 바꿔주기
            int loser = result[1] - 1;
            matches[winner][loser] = 1;
            matches[loser][winner] = 0;
        }
        
        for (int i = 0; i < n; i++) {
            int winCount = bfs(n, matches, i, 1);
            int loserCount = bfs(n, matches, i, 0);
            
            if (winCount + loserCount == n - 1) { // 자기 자신과의 경기는 제외
                answer++;
            }
        }
        
        return answer;
    }
    
    public int bfs(int n, int[][] matches, int player, int isWin) {
        Deque<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        
        q.offer(player);
        visited[player] = true;
        int count = 0;
        while(!q.isEmpty()) {
            int currP = q.poll();
            
            for (int nextP = 0; nextP < n; nextP++) {
                if (!visited[nextP] && matches[currP][nextP] == isWin) {
                    visited[nextP] = true;
                    q.offer(nextP); // 내가 이긴/진 사람이 이긴/진 사람도 이긴/진 거
                    count++;
                }
            }
        }
        return count;
    }
}