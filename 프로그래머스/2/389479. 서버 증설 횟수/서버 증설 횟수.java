import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < 24; i++) {
            int num = players[i];
            
            // 이용자 없으면 넘어감
            if (num == 0)
                continue;
            
            // 시간 지난 서버 반납
            while (!q.isEmpty() && q.peek() + k <= i) {
                q.poll();
            }
            
            // 서버 증설 필요한지 계산하기
            int server = q.size();
            // 서버 증설 필요
            if (num >= (server + 1) * m) {
                // int count = (num - (server * m)) / m;
                int count = num / m - server;
                answer += count;
                for (int j = 0; j < count; j++)
                    q.offer(i);
            }
        }
        
        return answer;
    }
}