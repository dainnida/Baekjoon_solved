class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        long longR1 = (long) r1, longR2 = (long) r2;
        
        for (long x = 1; x <= longR2; x++) { // 1사분원에서만 구함
            // 큰 원의 Y 좌표는 내림 (이하)
            long maxY = (long) Math.floor(Math.sqrt(longR2 * longR2 - x * x));
            long minY = 0;
            
            // 작은 원의 Y 좌표는 올림 (이상)
            if (longR1*longR1 - x*x > 0) {
                minY = (long) Math.ceil(Math.sqrt(longR1 * longR1 - x * x));
            }
            
            answer += maxY - minY + 1; // minY도 포함되어야 함
        }
        
        return answer*4;
    }
}