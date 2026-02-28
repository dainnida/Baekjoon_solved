import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        // for (int i=0; i<my_string.length(); i++) {
        //     int finalI = i;
        //     if (Arrays.stream(indices).anyMatch(x -> x == finalI))
        //         continue;
        //     answer += my_string.charAt(i);
        // }
        String tmp[] = my_string.split("");
        for (int i: indices) 
            tmp[i] = "";
        
        // return answer;
        return String.join("", tmp);
    }
}