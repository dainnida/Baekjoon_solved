import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            answer[i] = prices.length - i - 1;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }
        
        return answer;
    }
}