import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = 0, sum2 = 0;
        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new ArrayDeque<>();
        
        for (int i = 0; i < queue1.length; i++) {
            dq1.offer(queue1[i]);
            dq2.offer(queue2[i]);
            sum1 += queue1[i];
            sum2 += queue2[i];
        }
        
        if ((sum1 + sum2) % 2 != 0)
            return -1;
        
        while (sum1 != sum2) {
            if (answer > queue1.length * 3)
                return -1;
            if (sum1 > sum2) {
                int curr = dq1.poll();
                dq2.offer(curr);
                sum1 -= (long)curr;
                sum2 += (long)curr;
            }
            else {
                int curr = dq2.poll();
                dq1.offer(curr);
                sum1 += (long)curr;
                sum2 -= (long)curr;
            }
            answer++;
        }
        return answer;
    }
}