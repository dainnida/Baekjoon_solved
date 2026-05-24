import java.util.*;

class Solution {
    List<String> answer = new ArrayList<>();
    boolean found = false;
    
    public String[] solution(String[][] tickets) {
        int len = tickets.length;
        boolean[] visited = new boolean[len];
        
        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0]))
                return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
            });
        
        answer.add("ICN");
        backtrack(0, "ICN", tickets, visited);
        
        return answer.toArray(new String[0]);
    }
    
    public void backtrack(int n, String airport, String[][] tickets, boolean[] visited) {
        if (n == tickets.length) {
            found = true;
            return;
        }
        
        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(airport)) {
                
                // 방문 처리
                visited[i] = true;
                answer.add(tickets[i][1]);
                
                // 다음 노드로 이동
                backtrack(n + 1, tickets[i][1], tickets, visited);
                
                // 정답 찾았으면 끝
                if (found)
                    return;
                
                // 백트래킹
                visited[i] = false;
                answer.remove(answer.size() - 1);
            }
        }
    }
}