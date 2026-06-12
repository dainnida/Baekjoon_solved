import java.util.*;

class Solution {
    int answer = Integer.MAX_VALUE;
    List<String> mineralIndexs = List.of("diamond", "iron", "stone");
    int[][] tired = new int[][]{{1, 1, 1}, {5, 1, 1,}, {25, 5, 1}};
    int totalPicks = 0;
    
    public int solution(int[] picks, String[] minerals) {
        
        totalPicks = picks[0] + picks[1] + picks[2];
        
        List<Integer> combinations = new ArrayList<>();
        backtrack(picks, minerals, combinations);
        
        return answer;
    }
    
    public void backtrack(int[] picks, String[] minerals, List<Integer> combinations) {
        if (combinations.size() == totalPicks) { // 끝까지 다 봄
            int index = 0, currTired = 0;
            for (int combination : combinations) {
                for (int i = 0; i < 5; i++) {
                    if (index >= minerals.length) { // 피로도 검사 끝
                        answer = Math.min(answer, currTired);
                        return ;   
                    }
                    currTired += tired[combination][mineralIndexs.indexOf(minerals[index++])];
                }
            }
            answer = Math.min(answer, currTired); // 곡괭이 부족
            return ;  
        }
        
        for (int i = 0; i < 3; i++) {
            if (picks[i] >= 1) { // 곡괭이 남음
                combinations.add(i);
                picks[i]--; // 곡괭이 사용 처리
                
                backtrack(picks, minerals, combinations); // 다음 노드 진입
                
                combinations.remove(combinations.size() - 1); // 백트래킹
                picks[i]++; // 곡괭이 사용 해제
            }
        }
    }
}