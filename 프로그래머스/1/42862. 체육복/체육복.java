import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        Set<Integer> sameSet = new HashSet<>();
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int l : lost)
            lostSet.add(l);
        for (int r : reserve) {
            if (lostSet.contains(r))
                sameSet.add(r);
            reserveSet.add(r);
        }
        
        // 여벌의 체육복을 가져온 학생이 도난 당한 경우
        lostSet.removeAll(sameSet);
        reserveSet.removeAll(sameSet);
        
        for (int r : reserveSet) {
            if (lostSet.contains(r-1))
                lostSet.remove(r-1);
            else if (lostSet.contains(r+1))
                lostSet.remove(r+1);
        }
        
        return n - lostSet.size();
    }
}