class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for (int i=0; i<2; i++) {
            if (date1[i] < date2[i])
                return 1;
            if (date1[i] > date2[i])
                return 0;
        }
        if (date1[2] < date2[2])
            return 1;
        return 0;
    }
}