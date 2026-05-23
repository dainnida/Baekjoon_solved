import java.util.*;

class Solution {
    List<int[]> answer;
    
    public List<int[]> solution(int n) {
        answer = new ArrayList<>();
        
        hanoi(n, 1, 3, 2);
        
        return answer;
    }
    
    public void hanoi(int n, int from, int to, int via) {
        if (n == 1) {
            answer.add(new int[]{from, to});
            return;
        }
            
        hanoi(n-1, from, via, to); // n-1개 원판을 다른 기둥으로 대피시키기
        
        answer.add(new int[]{from, to}); // 맨 아래(n) 원판을 목표 기둥으로 옮기기
        
        hanoi(n-1, via, to, from); // 대피시킨 원판 목표 기둥으로 옮기기
    }
}