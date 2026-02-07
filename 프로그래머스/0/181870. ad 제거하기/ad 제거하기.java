import java.util.*;

class Solution {
    public List<String> solution(String[] strArr) {
        List<String> arrList = new ArrayList<>(strArr.length);
        for (String s: strArr){
            if (!s.contains("ad"))
                arrList.add(s);
        }
        return arrList;
    }
}