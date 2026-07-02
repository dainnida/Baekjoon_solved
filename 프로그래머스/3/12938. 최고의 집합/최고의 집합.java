import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        if (s < n) {
            return new int[]{-1};
        }
        
        int base = s / n;
        int mod = s % n;
        Arrays.fill(answer, base);
        
        for (int i = 0; i < mod; i++) {
            answer[n - 1 - i]++;
        }
        
        return answer;
    }
}