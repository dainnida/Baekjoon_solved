class Solution {
    int answer = 0;
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, computers, visited);
                answer++;
            }
        }
        
        return answer;
    }
    
    private void dfs(int curr, int[][] computers, boolean[] visited) {
        visited[curr] = true;
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[curr][i] == 1 && curr != i) {
                dfs(i, computers, visited);
            }
        }
    }
}