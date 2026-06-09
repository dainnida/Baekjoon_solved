import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (a, b) -> {
            if (b[0] == a[0])
                return b[1] - a[1];
            
            return b[0] - a[0];
        });
        
        int bullet = targets[0][0]; // 실수라 해당 수보다 아주 조금 작다고 치자.
        answer++;
        for (int i = 1; i < targets.length; i++) {
            if (targets[i][1] <= bullet) { // 범위 안에 들어가지 못한다.
                answer++;
                bullet = targets[i][0];
            }
        }
               
        return answer;
    }
}