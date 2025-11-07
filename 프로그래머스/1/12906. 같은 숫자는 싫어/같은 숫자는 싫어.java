import java.util.*;

public class Solution {
    public Integer[] solution(int []arr) {
        Integer[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for (int num: arr){
            if (stack.isEmpty() || stack.peek()!=num)
                stack.push(num);
        }
        answer = stack.toArray(new Integer[0]);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}