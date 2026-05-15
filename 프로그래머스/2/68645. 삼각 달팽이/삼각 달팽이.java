import java.util.*;

class Solution {
    public int[] solution(int n) {
        int len = 0;
        int[][] snail = new int[n][];
        for (int i = 1; i <= n; i++) {
            snail[i-1] = new int[i];
            len += i;
        }
        int[] answer = new int[len];

        int curr = 1, x = -1, y = 0;
        for (int i = 0; i < n; i++) { // 방향을 바꾸는 횟수
            for (int j = i; j < n; j++)  {// 각 이동에서의 달팽이 채우기 횟수
                if (i % 3 == 0) // 왼쪽 대각선 아래로 한 칸씩
                    snail[++x][y] = curr++;
                else if (i % 3 == 1) // 오른쪽으로 한 칸씩
                    snail[x][++y] = curr++;
                else  // 오른쪽 대각선 위로 한 칸씩
                    snail[--x][--y] = curr++;
            }    
        }
        
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < snail[i].length; j++)
                answer[k++] = snail[i][j];
        }
        
        return answer;
    }
}