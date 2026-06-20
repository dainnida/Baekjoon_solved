class Solution {
    int[] answer = {-1};
    int maxDiff = -1;
    
    public int[] solution(int n, int[] info) {
        
        int[] arrows = new int[11];
        backtrack(n, info, arrows, 0, 0);
        
        return answer;
    }
    
    public void backtrack(int n, int[] info, int[] arrows, int count, int point) {
        
        if (point == 11) { // 모든 점수를 다 돌았음 or 화살 다 써서 계산해야 함
            // 화살이 남았다면, 가장 낮은 점수를 많이 맞혀야 하므로 0점에 몰아줌
            arrows[10] += n - count;
            
            // 점수 계산
            calculateScore(info, arrows);
            
            // 다음 백트래킹으로 넘어가기 위해 되돌리기
            arrows[10] -= n - count;
            
            return;
        }
        
        if (count == n) { // 화살 다 쐈음
            backtrack(n, info, arrows, count, 11); // 점수 계산으로 바로 넘어감
            
            return;
        }
        
        // 1. 어피치의 화살보다 1개 더 많게 쏜다
        if (n - count > info[point]) { // 남은 화살 개수가 어피치가 쏜 화살보다 커야 더 많이 쏠 수 있음
            arrows[point] = info[point] + 1;
            backtrack(n, info, arrows, count + info[point] + 1, point + 1);
            
            // 만족하지 못하면 백트래킹 = 이 화살은 쏘지 않음
            arrows[point] = 0;
        }
        // 2. 이 점수는 아예 쏘지 않는다.
        backtrack(n, info, arrows, count, point + 1);
    }
    
    public void calculateScore(int[] info, int[] arrows) {
        int lion = 0, apeach = 0;
        // 라이언과 어피치 점수 계산
        for (int i = 10; i >= 0; i--) {
            if (arrows[10 - i] > info[10 - i]) // 화살을 더 많이 맞혀야지만 라이언이 점수 얻음
                lion += i;
            else if (info[10 - i] > 0) // 둘 다 0발일 때 제외해야 함. 즉, 어피치가 1발 이상 쐈을 때 라이언보다 같거나 많이 쏠 경우 어피치가 점수 얻음
                apeach += i;
        }
            
        // 라이언이 이겼다면 점수 차를 계산
        if (lion > apeach) {
            int currDiff = lion - apeach;
            
            // 더 큰 점수차라면 정답 갱신
            if (currDiff > maxDiff) {
                maxDiff = currDiff;
                answer = arrows.clone();
            }
            // 점수차가 같다면 가장 낮은 점수를 더 많이 맞힌 경우로 갱신
            else if (maxDiff == currDiff) {
                if (isBetter(arrows, answer))
                    answer = arrows.clone();
            }
        }
    }
    
    public boolean isBetter(int[] arrows, int[] answer) {
        for (int i = 10; i >= 0; i--) {
            if (arrows[i] != answer[i]) { // 처음으로 두 값이 다른 순간
                return arrows[i] > answer[i]; // arrows가 더 큰 게 맞는지 반환
            }
        }
        return false; // 모두 똑같아서 갱신 필요X
    }
}