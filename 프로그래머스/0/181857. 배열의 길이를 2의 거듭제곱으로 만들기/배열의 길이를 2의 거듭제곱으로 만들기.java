import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int nxtBin = 1;
        while (nxtBin < arr.length)
            nxtBin *= 2;
        
        return Arrays.copyOf(arr, nxtBin);
    }
}