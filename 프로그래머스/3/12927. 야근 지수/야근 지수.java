import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
//         Map<Integer, Integer> workCount = new TreeMap<>();
        
//         for (int i = 0; i < works.length; i++)
//             workCount.put(works[i], workCount.getOrDefault(works[i], 0)+ 1);
        
//         List<Integer> workKey = new ArrayList<>(workCount.getKeys());
//         int index = 0;
//         while (n > 0) {
//             if (index >= works.length)
//                 return 0;
//             if (index == works.length - 1) {
                
//             }
//             int gap = work
//         }
        
        Arrays.sort(works);
        int index = works.length - 1;
        int max = works[index];
        
        while (n > 0) {
            if (max == 0)
                return 0;
            if (index < 0 || works[index] < max) {
                index = works.length - 1;
                max = works[index];
                continue;
            }
            works[index]--;
            index--;
            n--;
        }
        
        for (int i = 0; i < works.length; i++) {
            answer += (long) Math.pow(works[i], 2);
        }
        
        return answer;
    }
}