class Solution {
    int answer = 0;
    
    public int solution(int n) {
        // 하나의 행에는 하나의 Q만 들어갈 수 있음, 각 row에서 Q의 y 위치가 원소
        int[] rows = new int[n];
        
        // [n, rows, 현재 row 위치(x)]
        backtrack(n, rows, 0);
        
        return answer;
    }
    
    public void backtrack(int n, int[] rows, int x) {
        
        // N-Queen 만족
        if (x == n) {
            answer++;
            return;
        }
        
        for (int y = 0; y < n; y++) {
            if (isSafe(x, y, rows)) {
                rows[x] = y;
                backtrack(n, rows, x + 1);
            }
                
        }
        
    }
    
    public boolean isSafe(int x, int y, int[] rows) {
        // 앞 줄에 높여있는 것만 확인해야 함.
        // Q를 놓았으나 실패했을 때 기록한 게 남아있을 수도 있으니.
        for (int i = 0; i < x; i++) {
            if (rows[i] == y)
                return false;
            if (Math.abs(x - i) == Math.abs(y - rows[i]))
                return false;
        }
        return true;
    }
}