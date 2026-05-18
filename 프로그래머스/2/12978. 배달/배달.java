import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        // 마을 1부터 N까지의 최단 거리
        int[] distance = new int[N+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[1] = 0;
        
        // 인접한 마을을 잇는 그래프 초기화
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++)
            graph.add(new ArrayList<>());
        
        // [다음 노드, 다음 노드까지의 길이]가 저장된 우선순위 큐
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        // 인접한 마을 잇기
        for (int[] r : road) {
            int a = r[0], b = r[1], c = r[2];
            graph.get(a).add(new int[]{b, c});
            graph.get(b).add(new int[]{a, c});
        }
        
        pq.offer(new int[]{1, 0});
        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currNode = curr[0], currLen = curr[1];
            
            if (currLen > distance[currNode])
                continue;
            
            for (int[] neighbor : graph.get(currNode)) {
                int nextNode = neighbor[0], nextLen = neighbor[1];
                
                if (distance[nextNode] > distance[currNode] + nextLen) {
                    distance[nextNode] = distance[currNode] + nextLen;
                    pq.offer(new int[]{nextNode, distance[nextNode]});
                }
            }            
        }
        
        // K보다 작은 거리 카운트
        for (int i = 1; i <= N; i++) {
            if (distance[i] <= K)
                answer++;
        }
        
        return answer;
    }
}