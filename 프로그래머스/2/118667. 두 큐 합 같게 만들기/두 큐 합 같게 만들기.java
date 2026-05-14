import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        int len = queue1.length;
        int[] combined = new int[len*2];
        long sum1 = 0, sum2 = 0;
        int left = 0, right = len;
        
        for (int i = 0; i < len; i++) {
            combined[i] = queue1[i];
            combined[len + i] = queue2[i];
            sum1 += queue1[i];
            sum2 += queue2[i];
        }
        
        if ((sum1 + sum2) % 2 != 0)
            return -1;
        
        while (left < 2*len && right < 2*len) {
            if (sum1 == sum2)
                return answer;
            if (sum1 > sum2) {
                int curr = combined[left++];
                sum1 -= (long)curr;
                sum2 += (long)curr;
            }
            else {
                int curr = combined[right++];
                sum1 += (long)curr;
                sum2 -= (long)curr;
            }
            answer++;
        }
        return -1;
    }
}