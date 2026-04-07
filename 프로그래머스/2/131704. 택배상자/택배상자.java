import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Deque<Integer> assis = new ArrayDeque<>(); // 스택
        
        for (int box=1; box < order.length+1; box++) {
            assis.push(box);
            
            while (!assis.isEmpty() && assis.peek().equals(order[answer])) {
                assis.pop();
                answer++;
            }
        }
        
        return answer;
    }
}