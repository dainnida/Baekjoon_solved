class Solution {
    public long solution(int w, int h) {
        long gcd = getGcd((long)w, (long)h);
        
        long totalSquares = (long) w * h;
        long damagedSquares = (long) w + h - gcd;
        
        // 전체 사각형 - 못 쓰는 사각형
        return totalSquares - damagedSquares;
    }

    private long getGcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}