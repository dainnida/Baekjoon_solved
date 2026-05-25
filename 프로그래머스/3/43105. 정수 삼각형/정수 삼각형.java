class Solution {
    public int solution(int[][] triangle) {
        int answer = -1;
        int len = triangle.length;
        int[][] dp = new int[len][len];
        dp[0][0] = triangle[0][0];
        
        for (int i = 1; i < len; i++) {
            triangle[i][0] += triangle[i-1][0];
            triangle[i][i] += triangle[i-1][i-1];
            
            for (int j = 1; j < i; j++)
                triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
        }
        
        for (int i = 0; i < len; i++)
            answer = Math.max(answer, triangle[len-1][i]);
        
        return answer;
    }
}