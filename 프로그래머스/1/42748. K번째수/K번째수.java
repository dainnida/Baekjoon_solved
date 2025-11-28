import java.util.*;

class Solution {
    public List solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for (int[] arr: commands) {
            int[] temp = Arrays.copyOfRange(array, arr[0]-1, arr[1]);
            Arrays.sort(temp);
            answer.add(temp[arr[2]-1]);
        }
        return answer;
    }
}