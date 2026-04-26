class Solution {
    int answer = -1;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
    
        return answer;
    }
    
    private void dfs(int currK, int[][] dungeons, int count) {
        answer = Math.max(answer, count);
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && currK >= dungeons[i][0]) {
                visited[i] = true;
                dfs(currK - dungeons[i][1], dungeons, count+1);
                visited[i] = false;
            }
        }
    }
}