import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        // 1. 내림차순으로 정렬하는 방법
//         Arrays.sort(targets, (a, b) -> {
//             if (b[0] == a[0])
//                 return b[1] - a[1];
            
//             return b[0] - a[0];
//         });
        
//         int bullet = targets[0][0]; // 실수라 해당 수보다 아주 조금 작다고 치자.
//         answer++;
//         for (int i = 1; i < targets.length; i++) {
//             if (targets[i][1] <= bullet) { // 범위 안에 들어가지 못한다.
//                 answer++;
//                 bullet = targets[i][0];
//             }
//         }
        
        // 2. 오름차순으로 정렬하는 방법
        Arrays.sort(targets, (a, b) -> {
            if (a[1] == b[1])
                return a[0] - b[0];
            
            return a[1] - b[1];
        });
        
        int bullet = targets[0][1]; // 실수라 해당 수보다 아주 조금 작다고 치자.
        answer++;
        for (int i = 1; i < targets.length; i++) {
            if (targets[i][0] >= bullet) { // 범위 안에 들어가지 못한다.
                answer++;
                bullet = targets[i][1];
            }
        }
               
        return answer;
    }
}