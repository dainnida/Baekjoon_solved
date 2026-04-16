import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        boolean[][] graph = new boolean[n+1][n+1];
        for (int[] wire: wires) {
            int a = wire[0], b = wire[1];
            graph[a][b] = true;
            graph[b][a] = true;
        }
        
        for (int[] wire: wires) {
            int a = wire[0], b = wire[1];
            Deque<Integer> q = new ArrayDeque<>();
            boolean[] visited = new boolean[n+1];
            
            graph[a][b] = false; // 임시로 두 노드 사이 끊기 = 전력망 끊기
            graph[b][a] = false;
            q.offer(a);
            visited[a] = true;
            int count = 1;
            
            while (!q.isEmpty()) {
                int curr = q.poll();
                
                for (int i = 1; i <= n; i++) {
                    // graph[curr][i]가 true(연결됨)이고, 아직 방문 안 했다면
                    if (graph[curr][i] && !visited[i]) {
                        visited[i] = true;
                        q.offer(i);
                        count++;
                    }
                }
            }
            
            int diff = Math.abs(count - (n - count));
            answer = Math.min(answer, diff);
            
            graph[a][b] = true; // 끊었던 전력망 원상복구
            graph[b][a] = true;
        }
        return answer;
    }
}