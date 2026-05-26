import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        Arrays.sort(times);
        long left = 1;
        // 가장 오래 걸리는 심사관이 혼자 다 담당
        long right = (long) times[times.length - 1] * n;
        
        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;
            
            for (int time : times)
                count += mid / time; // 각 심시관이 심사할 수 있는 사람 수
                
            if (count >= n) {
                answer = mid;
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        
        return answer;
    }
}