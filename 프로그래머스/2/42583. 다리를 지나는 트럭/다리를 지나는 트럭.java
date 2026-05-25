import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Deque<Integer> bridge = new ArrayDeque<>();
        int total_weight = 0;
        int index = 0;
        
        while (index < truck_weights.length) {
            if (bridge.size() == bridge_length)
                total_weight -= bridge.poll();
            
            // 현재 트럭이 다리에 오를 수 있다면
            if (total_weight + truck_weights[index] <= weight) {
                bridge.offer(truck_weights[index]);
                total_weight += truck_weights[index];
                index++;
            }
            else // 오를 수 없다면 빈 공간으로 채움
                bridge.offer(0);
           
            answer++;
        }

        return answer + bridge_length;
    }
}