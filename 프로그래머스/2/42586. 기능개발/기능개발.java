import java.util.*;

class Solution {
    public List solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i=0; i<progresses.length; i++) {
            int days = (int)((100-progresses[i]) / speeds[i]);
            days += ((100-progresses[i]) % speeds[i]==0) ? 0 : 1;
            queue.offer(days);
        }
        
        while(!queue.isEmpty()) {
            int cnt = 1;
            int days = queue.poll();
            while (!queue.isEmpty() && days >= queue.peek()) {
                cnt++;
                queue.poll();
            }
            answer.add(cnt);
        }
        
        return answer;
    }
}