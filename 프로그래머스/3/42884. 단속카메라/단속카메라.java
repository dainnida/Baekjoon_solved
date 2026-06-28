import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
//         Arrays.sort(routes, (a, b) -> {
//             if (a[0] == b[0])
//                 return a[1] - b[1];
//             return a[0] - b[0];
//         });
        
//         int start = routes[0][0], end = routes[0][1];
//         answer++;
//         for (int i = 1; i < routes.length; i++) {
//             if (routes[i][0] > end) { // 겹치는 부위X
//                 start = routes[i][0];
//                 end = routes[i][1];
//                 answer++;
//             }
//             else {
//                 start = routes[i][0];
//                 end = Math.min(end, routes[i][1]);
//             }
//         }
        
        // end만 봐도 됨 기준
        Arrays.sort(routes, (a, b) -> a[1] - b[1]);
        
        int end = routes[0][1];
        answer++;
        for (int i = 1; i < routes.length; i++) {
            if (routes[i][0] > end) {
                end = routes[i][1];
                answer++;
            }
        }
    
        return answer;
    }
}