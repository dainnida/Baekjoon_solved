import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int last = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==2 && start == -1)
                start = i;
            else if (arr[i]==2)
                last = i;
        }
        if (start == -1) 
            return new int[]{-1};
        if (last == -1) 
            return new int[]{2};
        return Arrays.copyOfRange(arr, start, last+1);
    }
}