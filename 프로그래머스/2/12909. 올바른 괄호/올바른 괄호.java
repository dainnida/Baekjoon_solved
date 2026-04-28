import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)+"").equals("(")) 
                stack.push("(");
            else {
                if (stack.isEmpty() || (stack.peek()).equals(")"))
                    return false;
                stack.pop();
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }
}