import java.util.*;

class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = new int[sources.length];
        // 목적지에서 출발해서 도착할 수 있는 지역의 거리 저장
        int[] distance = new int[n + 1];
        Arrays.fill(distance, -1); // 도달할 수 없으면 -1
        distance[destination] = 0; // 자기 자신은 0
        
        // 매번 모든 road를 훑으면 시간초과가 나므로 각 지역과 연결되어 있는 지역 리스트를 미리 저장해둔다
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());
        
        for (int[] road : roads) {
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }
        
        Deque<Integer> q = new ArrayDeque<>();
        
        q.offer(destination);
        while(!q.isEmpty()) {
            int currRegion = q.poll();
            
            for (int nextRegion : graph.get(currRegion)) {
                if (distance[nextRegion] == -1) { // 아직 방문 안함
                    distance[nextRegion] = distance[currRegion] + 1;
                    q.offer(nextRegion);
                }
            }
        }
        
        for (int i = 0; i < sources.length; i++) {
            answer[i] = distance[sources[i]];
        }
        
        return answer;
    }
}