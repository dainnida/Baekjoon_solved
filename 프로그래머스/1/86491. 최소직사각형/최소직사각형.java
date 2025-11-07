import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxC = 0;
        for (int[] size: sizes) {
            int w = Math.max(size[0], size[1]);
            int c = Math.min(size[0], size[1]);
            maxW = Math.max(maxW, w);
            maxC = Math.max(maxC, c);
        }
        return maxW * maxC;
    }
}