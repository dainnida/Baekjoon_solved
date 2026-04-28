import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<String> q = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)+"").equals("(")) 
                q.offer("(");
            else {
                if (q.isEmpty() || (q.peek()).equals(")"))
                    return false;
                q.poll();
            }
        }
        if (q.isEmpty())
            return true;
        return false;
    }
}