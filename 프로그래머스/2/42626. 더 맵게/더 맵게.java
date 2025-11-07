import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int s: scoville)
            pq.offer(s);
        while (pq.size() > 1 && pq.peek() < K){
            int first = pq.poll();
            int second = pq.poll();
            pq.offer(first+(second*2));
            answer++;
        }
        return (pq.peek()<K) ? -1 : answer;
    }
}