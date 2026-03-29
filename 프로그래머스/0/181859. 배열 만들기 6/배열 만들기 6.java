import java.util.*;

class Solution {
    public Deque<Integer> solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();
        int i = 0;
        while (i < arr.length) {
            if (!stk.isEmpty() && stk.peekLast() == arr[i])
                stk.removeLast();
            else 
                stk.addLast(arr[i]);
            i++;
        }
        if (stk.isEmpty())
            stk.add(-1);
        return stk;
    }
}