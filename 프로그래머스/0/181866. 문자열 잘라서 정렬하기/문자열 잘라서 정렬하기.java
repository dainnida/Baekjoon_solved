import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = {};
        arr = myString.split("x+");
        
        List<String> arrList = new ArrayList<>();
        for (String s: arr) {
            if (!s.isEmpty())
                arrList.add(s);
        }
        
        String[] answer = arrList.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}