import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        for (int i : arr){
            for (int k=i; k>0; k--)
                arrList.add(i);
        }
        // return arrList.stream().mapToInt(Integer::intValue).toArray();
        return arrList;
    }
}