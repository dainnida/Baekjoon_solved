import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];
        System.arraycopy(num_list, n, answer, 0, len-n);
        System.arraycopy(num_list, 0, answer, len-n, n);
        return answer;
    }
}