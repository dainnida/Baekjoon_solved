import java.util.*;

class Solution {
    int answer = 0;
    
    public int solution(int n, int[][] q, int[] ans) {
        
        Set<Integer> combis = new HashSet<>();
        backtrack(n, q, ans, combis, 1);
        
        return answer;
    }
    
    public void backtrack(int n, int[][] q, int[] ans, Set<Integer> combis, int index) {
        // 조합 완성
        if (combis.size() == 5) {
            // q를 돌면서 ans를 모두 만족하는지 확인
            boolean isPass = true;
            
            for (int i = 0; i < q.length; i++) {
                int count = 0;
                for (int qValue : q[i]) {
                    if (combis.contains(qValue))
                        count++;
                }
                
                // 하나라도 실패하면 즉시 끝
                if (count != ans[i]) {
                    isPass = false;
                    break;
                }
            }
            
            // 이 조합은 만족
            if (isPass)
                answer++;
            
            return;
        }
        
        for (int i = index; i <= n; i++) {
            combis.add(i);
            backtrack(n, q, ans, combis, i + 1); // 다음 노드 진입
            combis.remove(i); // 백트래킹
        }
    }
}