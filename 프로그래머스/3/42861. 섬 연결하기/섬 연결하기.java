import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        // 건설한 다리 개수
        int bridgeCount = 0;
        
        // 자신의 최상위 노드를 저장하는 배열
        int[] parents = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }
        
        // 비용을 기준으로 오름차순 정렬
        Arrays.sort(costs, (a, b) -> (a[2] - b[2]));
        
        for (int[] cost: costs) {
            // 모든 다리 연결 끝
            if (bridgeCount == n - 1)
                break;
            
            if (find(cost[0], parents) != find(cost[1], parents)) { // 두 섬은 연결되어 있지 않으므로 다리 건설
                bridgeCount++;
                answer += cost[2];
                union(cost[0], cost[1], parents);
            }
        }
        
        return answer;
    }
    
    public int find(int x, int[] parents) {
        if (parents[x] == x)
            return x;
         return parents[x] = find(parents[x], parents);
    }
    
    public void union(int a, int b, int[] parents) {
        int parentA = find(a, parents);
        int parentB = find(b, parents);
        if (parentA != parentB) // 부모가 서로 다르다면
            parents[parentA] = parentB; // 다른 한쪽으로 갱신
    }
}