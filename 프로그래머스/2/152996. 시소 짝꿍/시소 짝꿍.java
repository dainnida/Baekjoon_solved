import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Integer, Long> dic = new HashMap<>();
        
        for (int weight : weights) 
            dic.put(weight, dic.getOrDefault(weight, 0L) + 1);   
        
        for (int weight : dic.keySet()) {
            long count = dic.get(weight);
            
            // 같은 몸무게
            if (count > 1)
                answer += (count * (count - 1)) / 2;
            
            // 2 : 3
            if (weight % 2 == 0 && dic.containsKey(weight / 2 * 3))
                answer += count * dic.get(weight / 2 * 3);
            
            // 2 : 4
            if (dic.containsKey(weight * 2))
                answer += count * dic.get(weight * 2);
            
            // 3 : 4
            if (weight % 3 == 0 && dic.containsKey(weight / 3 * 4))
                answer += count * dic.get(weight / 3 * 4);
        }
        
        return answer;
    }
}