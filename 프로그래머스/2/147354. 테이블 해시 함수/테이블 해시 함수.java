import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        // data[i][j]는 i + 1 번째 튜플의 j + 1 번째 컬럼의 값을 의미하므로
        row_begin--; row_end--;
        
        // 람다의 변수는 값이 변하지 않아야 함(final)
        Arrays.sort(data, (a, b) -> {
           if (a[col - 1] == b[col - 1])
               return b[0] - a[0]; // 내림차순
            return a[col - 1] - b[col - 1]; // 오름차순
        });
        
        for (int i = row_begin ; i <= row_end; i++) {
            int s_i = 0;
            for (int j = 0; j < data[i].length; j++) {
                // 1을 뺐으니 여기선 원상복구
                s_i += data[i][j] % (i + 1);
            }
            answer = answer ^ s_i;
        }
        
        return answer;
    }
}