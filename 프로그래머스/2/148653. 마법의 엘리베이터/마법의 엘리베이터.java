class Solution {
    public int solution(int storey) {
        int answer = 0;
        int[] stone = new int[storey+1];
        stone[0] = 0; stone[1] = 1;
        
        for (int i = 2; i <= storey; i++) {
            int minS = 1000000;
            int j = 1;
            while (i - j >= 0) {
                minS = Math.min(minS, stone[i-j] + 1);
                j *= 10;
            }
            if (j - i < i) { // 뺄셈인 경우도 보기
                minS = Math.min(minS, stone[j-i] + 1);
            }
            stone[i] = minS;
        }
        
        return stone[storey];
    }
}