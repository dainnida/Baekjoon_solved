import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, 0});
        int[] visited = new int[y+1];
        
        if (x == y)
            return 0;
        
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            int curr = tmp[0];
            int count = tmp[1];
            
            for (int node: new int[]{curr+n, curr*2, curr*3})
                if (node == y)
                    return count+1;
                else if (node < y && visited[node] == 0) {
                    visited[node]++;
                    q.offer(new int[]{node, count+1});
                }
        }
        
        return -1;
    }
}