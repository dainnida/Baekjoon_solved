import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int n:nums)
            map.put(n, map.getOrDefault(n, 0)+1);
        if (map.keySet().size() <= nums.length/2)
            answer = map.keySet().size();
        else 
            answer = nums.length/2;
    
        return answer;
    }
}