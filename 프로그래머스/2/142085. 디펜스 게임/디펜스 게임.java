import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < enemy.length; i++) {
            
            // 무족권이 없다고 생각하고 적이랑 싸운다
            n -= enemy[i];
            pq.offer(enemy[i]);
            
            // 적과 더이상 싸울 수 없다면, 가장 많은 적과 싸웠을 때 무족권을 쓴다
            if (n < 0) {
                if (k > 0) {
                    n += pq.poll();
                    k--;
                }
                // 무족권을 쓸 수도 없다면 종료
                else
                    return answer;
            }
            answer++;
        }
        return answer;
    }
}