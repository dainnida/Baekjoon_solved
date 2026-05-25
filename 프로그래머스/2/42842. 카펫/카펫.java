import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        for (int x = 1; x <= (int)Math.sqrt(yellow); x++) {
            if (yellow % x == 0) {
                int y = yellow / x;
            
                if ((x+2) * (y+2) == brown + yellow) {
                    answer = new int[]{y+2, x+2};
                    break;
                }
            }
        }
        
        return answer;
    }
}