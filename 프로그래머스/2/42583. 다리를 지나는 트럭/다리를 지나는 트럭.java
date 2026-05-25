import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        Deque<int[]> bridge = new ArrayDeque<>();
        int total_weight = 0;
        
        for (int truck_weight : truck_weights) {
            while (!bridge.isEmpty()) {
                // 현재 트럭이 다리에 오를 수 있을 때까지
                if (total_weight + truck_weight <= weight && bridge.size() + 1 <= bridge_length)
                    break;
                
                int[] first = bridge.poll();
                total_weight -= first[0];
                // 해당 트럭이 다리를 다 지나가는 데 걸리는 시간
                if (answer - first[1] < bridge_length) // 아직 더 지나가야 함
                    answer += bridge_length - (answer - first[1]);
            }
            
            bridge.offer(new int[]{truck_weight, answer});
            total_weight += truck_weight;
            answer++;
        }
        // 남은 트럭 다 지나가기
        while (!bridge.isEmpty()) {
            int[] first = bridge.poll();
            total_weight -= first[0];
            answer += bridge_length - (answer - first[1]);
        }

        return answer;
    }
}