import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String str : intStrs) {
            int tmp = Integer.parseInt(str.substring(s, s+l));
            if (tmp > k)
                answer.add(tmp);
        }
        return answer;
    }
}