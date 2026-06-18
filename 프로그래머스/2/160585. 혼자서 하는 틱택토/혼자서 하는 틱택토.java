import java.util.*;

class Solution {
    int n = 3;
    
    public int solution(String[] board) {
        List<int[]> placeO = new ArrayList<>();
        List<int[]> placeX = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i].charAt(j) == 'O')
                    placeO.add(new int[]{i, j});
                else if (board[i].charAt(j) == 'X')
                    placeX.add(new int[]{i, j});
            }
        }
        
        int countO = placeO.size(), countX = placeX.size();
        
        // O는 항상 X와 같거나 1개 더 많이 놓아져 있어야 한다
        if (countO - countX < 0 || countO - countX > 1)
            return 0;
        
        // 3개를 다 놓지 못한 상황은(= 아무도 이길 수 없음) 어떤 경우든 둘 수 있음
        if (countO < 3)
            return 1;
        
        // 이미 이긴 상황에서 더 진행하면 안된다
        // O가 이겼으면 X보다 1개 더 놓은 상태여야 함
        for (int[] point : placeO) {
            if (checkRow(board, point[0], point[1]) || checkColumn(board, point[0], point[1])
                || checkDiagonal(board, point[0], point[1])) {
                if (countO != countX + 1)
                    return 0;
            }
        }
        
        // X가 이겼으면 O와 같은 개수만큼 놓은 상태여야 함
        for (int[] point : placeX) {
            if (checkRow(board, point[0], point[1]) || checkColumn(board, point[0], point[1])
                || checkDiagonal(board, point[0], point[1])) {
                if (countO != countX)
                    return 0;
            }
        }
        
        return 1;
    }
    
    
    // 가로로 이겼는지 확인
    public boolean checkRow(String[] board, int x, int y) {
        char turn = board[x].charAt(y);
        
        for (int j = 0; j < n; j++) {
            if (j != y && board[x].charAt(j) != turn)
                return false;
        }
        return true;
    }
    
    // 세로로 이겼는지 확인
    public boolean checkColumn(String[] board, int x, int y) {
        char turn = board[x].charAt(y);
        
        for (int i = 0; i < n; i++) {
            if (i != x && board[i].charAt(y) != turn)
                return false;
        }
        return true;
    }
    
    // 대각선으로 이겼는지 확인
    public boolean checkDiagonal(String[] board, int x, int y) {
        if (x != 1 || y != 1) // 3개가 같아야 하므로 \와 /의 중간점인 (1, 1)만 검사하자
            return false;
        
        char turn = board[x].charAt(y);
        
        // 왼쪽 대각선(\) 검사
        if (board[0].charAt(0) == turn && board[2].charAt(2) == turn) {
            return true;
        }
        
        // 오른쪽 대각선(\) 검사
        if (board[0].charAt(2) == turn && board[2].charAt(0) == turn) {
            return true;
        }
        
        return false;
    }
}