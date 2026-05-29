import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        
        for (String operation : operations) {
            String[] op_arr = operation.split(" ");
            if (op_arr[0].equals("I")) {
                maxQ.offer(Integer.parseInt(op_arr[1]));
                minQ.offer(Integer.parseInt(op_arr[1]));
                continue;
            }
            if (op_arr[1].equals("1") && !maxQ.isEmpty()) {
                int maxN = maxQ.poll();
                minQ.remove(maxN);
            }
            else if (op_arr[1].equals("-1") && !minQ.isEmpty()) {
                int minN = minQ.poll();
                maxQ.remove(minN);
            }
        }
        
        if (!maxQ.isEmpty()) {
            answer[0] = maxQ.poll();
            answer[1] = minQ.poll();
        }
        return answer;
    }
}