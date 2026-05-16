class Solution {
    public int solution(int storey) {
        return dfs(storey);
    }
    
    private int dfs(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        
        int down = dfs(n / 10) + n % 10;
        int up = dfs(n / 10 + 1) + (10 - n % 10);
        
        return Math.min(down, up);
    }
}