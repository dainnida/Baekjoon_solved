class Solution
{
    public int solution(int [][]board)
    {
        int n = board.length;
        int m = board[0].length;
        if (n == 1 || m == 1)
            return 1;

        int answer = 0;
        
        // dp에 저장되는 값은, 정사각형의 가장 오른쪽 아래의 값을 기준으로[x][y]
        // 정사각형의 크기를 저장함
        int[][] dp = new int[n][m];
        
        // [x][y], [x][y+1], [x+1][y], [x+1][y+1] 의 값이 모두 같으면
        // 다음 크기의 정사각형으로 만들 수 있음
        // 즉, [x+1][y+1]을 기준으로 나머지 값 중 최솟값 + 1임(최솟값은 모두 포함되니까)
        for (int x = 1; x < n; x++) {
            for (int y = 1; y < m; y++) {
                // 가장 마지막 칸이 0이면 정사각형이 성립이 안됨
                if (board[x][y] == 1) {
                    board[x][y] = Math.min(Math.min(board[x-1][y-1], board[x-1][y]), board[x][y-1]) + 1;
                    
                    answer = Math.max(answer, board[x][y]);
                }
            }
        }
        
        return answer*answer;
    }
}