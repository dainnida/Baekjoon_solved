import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int max = -1;
        
        // 노드 연결
        List<Integer>[] graph = new ArrayList[n+1];
        for (int i = 0; i <= n; i++)
            graph[i] = new ArrayList<>();
        for (int[] e : edge) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        
        // 가장 먼 노드 찾기
        Queue<Integer> q = new ArrayDeque<>();
        int[] dist = new int[n+1]; // 1번 노드부터 i번 노드까지의 거리
        
        q.offer(1);
        dist[1] = 1;
        while(!q.isEmpty()) {
            int curr = q.poll();
            for (int neighbor : graph[curr]) {
                if (dist[neighbor] == 0) {
                    q.offer(neighbor);
                    dist[neighbor] = dist[curr] + 1;
                    if (dist[neighbor] > max) {
                        max = dist[neighbor];
                        answer = 1;
                    }
                    else if (dist[neighbor] == max)
                        answer++;
                }
            }
        }
            
        return answer;
    }
}