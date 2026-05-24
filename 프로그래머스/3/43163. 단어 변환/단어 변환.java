import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Deque<String[]> q = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];
        
        q.offer(new String[]{begin, "0"});
        while (!q.isEmpty()) {
            String[] curr = q.poll();
            String currWord = curr[0];
            int count = Integer.parseInt(curr[1]);
            
            if (currWord.equals(target))
                return count;
            
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && check(currWord, words[i])) {
                    q.offer(new String[]{words[i], String.valueOf(count + 1)});
                    visited[i] = true;
                }
            }
        }
        
        return 0;
    }
    
    public boolean check(String from, String to) {
        int count = 0;
        
        for (int i = 0; i < from.length(); i++) {
            if (from.charAt(i) == to.charAt(i))
                count++;
        }
        
        if (count == from.length() - 1)
            return true;
        return false;
    }
}