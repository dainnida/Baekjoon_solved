import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int lngth = arr.length;
        int nxtBin = 1;
        while (nxtBin < lngth)
            nxtBin *= 2;
        
        return Arrays.copyOf(arr, nxtBin);
    }
}