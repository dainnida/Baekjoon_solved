import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> arrList= new ArrayList<>();
        for (int i=0; i<2; i++) {
            for (int j=intervals[i][0]; j<intervals[i][1]+1; j++)
                arrList.add(arr[j]);
        }
        return arrList;
    }
}