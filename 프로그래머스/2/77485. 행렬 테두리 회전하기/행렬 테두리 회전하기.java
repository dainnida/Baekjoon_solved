class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] board = new int[rows+1][columns+1];
        
        // 행렬 만들기
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++)
                board[i][j] = columns * (i - 1) + j;
        }
        
        for (int i = 0; i < queries.length; i++) {
            int x1 = Math.min(queries[i][0], queries[i][2]), y1 = Math.min(queries[i][1], queries[i][3]), x2 = Math.max(queries[i][0], queries[i][2]), y2 = Math.max(queries[i][1], queries[i][3]);
            int min = 10001;
            
            int previous = board[x1][y1];
            min = Math.min(min, previous);
            for (int j = y1 + 1; j <= y2; j++) {
                int temp = board[x1][j];
                board[x1][j] = previous;
                previous = temp;
                min = Math.min(min, previous);
            }
            
            for (int j = x1 + 1; j <= x2; j++) {
                int temp = board[j][y2];
                board[j][y2] = previous;
                previous = temp;
                min = Math.min(min, previous);
            }
            
            for (int j = y2 - 1; j >= y1; j--) {
                int temp = board[x2][j];
                board[x2][j] = previous;
                previous = temp;
                min = Math.min(min, previous);
            }
            
            for (int j = x2 - 1; j > x1; j--) {
                int temp = board[j][y1];
                board[j][y1] = previous;
                previous = temp;
                min = Math.min(min, previous);
            }
                
            board[x1][y1] = previous;
            
            answer[i] = min;
        }
        
        return answer;
    }
}