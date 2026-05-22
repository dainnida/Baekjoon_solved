class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] board = new int[rows+1][columns+1];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        // 행렬 만들기
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++)
                board[i][j] = columns * (i - 1) + j;
        }
        
        // 회전하기
        for (int i = 0; i < queries.length; i++) {
            int x1 = Math.min(queries[i][0], queries[i][2]), y1 = Math.min(queries[i][1], queries[i][3]), x2 = Math.max(queries[i][0], queries[i][2]), y2 = Math.max(queries[i][1], queries[i][3]);
            
            int previous = board[x1][y1];
            int min = previous;
            
            int cx = x1, cy = y1;
            int dir = 0;
            
            while (dir < 4) {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];
                
                if (nx < x1 || nx > x2 || ny < y1 || ny > y2) {
                    dir++;
                    continue;
                }
            
                int temp = board[nx][ny];
                board[nx][ny] = previous;
                previous = temp;
                min = Math.min(min, previous);

                cx = nx;
                cy = ny;
            }
            
            answer[i] = min;
        }
        
        return answer;
    }
}