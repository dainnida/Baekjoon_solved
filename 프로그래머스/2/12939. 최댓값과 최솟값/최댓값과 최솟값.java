import java.util.*;

class Solution {
    public String solution(String s) {
        int min = 10000000;
        int max = -10000000;
        
        for (String aStr : s.split(" ")) {
            int aInt = Integer.parseInt(aStr);
            if (aInt > max)
                max = aInt;
            if (aInt < min)
                min = aInt;
        }
        
        return Integer.toString(min) + " " + Integer.toString(max);
    }
}