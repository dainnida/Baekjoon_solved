import java.util.*;

class Solution {
    public List<Integer> solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> dic = new HashMap<>();
        for (int i=1; i<27; i++)
            dic.put("" + (char)('A'+i-1), i); // 'A'+1은 int, char로 변환하면 'B'
        
        int n = 0;
while (n < msg.length()) {
            String tmp = "" + msg.charAt(n);
            int nextN = n + 1;
            
            while (nextN < msg.length()) {
                String nextTmp = tmp + msg.charAt(nextN);
                
                if (dic.containsKey(nextTmp)) {
                    tmp = nextTmp;
                    nextN++;
                } else
                    break;
            }
            
            answer.add(dic.get(tmp));
            
            if (nextN < msg.length()) {
                dic.put(tmp + msg.charAt(nextN), dic.size() + 1);
            }
            
            n += tmp.length();
        }
        
        return answer;
    }
}