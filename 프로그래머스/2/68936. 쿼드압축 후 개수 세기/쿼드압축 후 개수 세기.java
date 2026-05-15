class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        int len = arr.length;
        boolean[][] dp = new boolean[len][len];
        
        for (int size = len; size > 0; size /= 2) {
            for (int x = 0; x < len; x += size) {
                for (int y = 0; y < len; y += size) {
                    if (dp[x][y]) // 이미 압축됨
                        continue;
                    if (check(x, y, size, arr)) {
                        answer[arr[x][y]]++;
                        visit(x, y, size, dp);
                    }
                }
            }
        }
        return answer;
    }
    
    private boolean check(int x, int y, int size, int[][] arr) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[x][y] != arr[i][j])
                    return false;
            }
        }
        return true;
    }
    
    private void visit(int x, int y, int size, boolean[][] dp) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++)
                dp[i][j] = true;
        }
    }
}