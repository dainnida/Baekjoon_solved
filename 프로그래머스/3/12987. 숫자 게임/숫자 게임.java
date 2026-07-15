import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int idxA = 0, idxB = 0;
        while (idxB < B.length) {
            // 매칭 끝
            if (A[idxA] < B[idxB]) {
                answer++;
                idxA++;
                idxB++;
            }
            // B가 더 커질 때까지 점수 찾기
            else {
                idxB++;
            }
        }
        
        
        return answer;
    }
}