import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for (int num: arr)
            answer.add(num);
        
        for (int num: delete_list){
            answer.remove(Integer.valueOf(num));
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}