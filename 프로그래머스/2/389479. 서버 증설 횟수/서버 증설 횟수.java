import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int[] minusServer = new int[24 + k];
        int server = 0;
        
        for (int i = 0; i < 24; i++) {
            
            // 시간 지난 서버 반납
            server -= minusServer[i];
            
            // 서버 증설 필요한지 계산하기
            int requireServer = players[i] / m;
            // 서버 증설 필요
            if (requireServer > server) {
                int count = requireServer - server;
                answer += count;
                server += count;
                minusServer[i + k] += count;
            }
        }
        
        return answer;
    }
}