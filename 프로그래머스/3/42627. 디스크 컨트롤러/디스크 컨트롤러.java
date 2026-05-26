import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        // 요청 시간이 작은 순으로 jobs 정렬
        Arrays.sort(jobs, (a, b) -> a[0]- b[0]);
        
        // 대기 큐
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        
        int index = 0; // 다음에 넣을 jobs의 인덱스
        int time = 0; // 지난 시간
        int count = 0; // 작업 완료한 디스크의 개수
    
        while (count < jobs.length) {
            // 현재 시간에 큐에 들어올 수 있으면 담기
            while (index < jobs.length && time >= jobs[index][0]) {
                pq.offer(jobs[index]);
                index++;
            }
            
            // 현재 처리할 수 있는 디스크가 없으면
            if (pq.isEmpty()) {
                time = jobs[index][0];
                continue;
            }
            
            int[] disk = pq.poll();
            answer += time - disk[0] + disk[1];
            time += disk[1];
            count++;
                
                
        }
        
        return answer / jobs.length;
    }
}