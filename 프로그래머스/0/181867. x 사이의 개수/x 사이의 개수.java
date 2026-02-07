import java.util.*;

class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> arrList = new ArrayList<>();
        int cnt = 0;
        for (char c : myString.toCharArray()) {
            if (c == 'x') {
                arrList.add(cnt);
                cnt = 0;
            }
            else
                cnt++;
        }
        arrList.add(cnt);
        return arrList;
    }
}