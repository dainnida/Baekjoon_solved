import java.util.*;

class Solution {
    
    int answer = 0;
    boolean[] visited;
    Set<List<String>> s = new HashSet<>();
    List<String> idList = new ArrayList<>();
    
    public int solution(String[] user_id, String[] banned_id) {
        visited = new boolean[user_id.length];
        
        backtrack(user_id, banned_id, 0);
        
        return s.size();
    }
    
    public void backtrack(String[] user_id, String[] banned_id, int count) {
        if (count == banned_id.length) {
            List<String> sortedList = idList; // 순서 통일해야 조합으로 비교 가능
            Collections.sort(sortedList);
            
            s.add(sortedList);
            return;
        }
        
        for (int i = 0; i < user_id.length; i++) {
            if (!visited[i] && isAble(user_id[i], banned_id[count])) {
                visited[i] = true;
                idList.add(user_id[i]);
                backtrack(user_id, banned_id, count + 1);
                visited[i] = false; // 백트래킹
                idList.remove(user_id[i]);
            }
        }
        
    }
    
    boolean isAble(String user, String banned) {
        if (user.length() != banned.length())
            return false;
        
        for (int i = 0; i < user.length(); i++) {
            if (banned.charAt(i) != '*' && user.charAt(i) != banned.charAt(i))
                return false;
        }
        return true;
    }
}