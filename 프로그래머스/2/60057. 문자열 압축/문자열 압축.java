import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        int last = s.length() / 2;
        
        for (int i = 1; i <= last; i++) {
            StringBuilder pressed = new StringBuilder();
            String currCut = s.substring(0, i);
            int count = 1;

            for (int j = i; j < s.length(); j += i) {
                // 가장 마지막 블록은 i 길이보다 작을 수도 있음
                int lastIdx = Math.min(i + j, s.length());
                String nextCut = s.substring(j, lastIdx);
                
                if (currCut.equals(nextCut)) { // 문자가 반복됨
                    count++;
                    continue;
                }
                // 문자가 반복되지 않거나 압축이 끝났음
                pressed.append(count == 1 ? currCut : count + currCut);
                
                // 현재부터 다시 압축되는지 세기
                currCut = nextCut;
                count = 1;
            }
            // 마지막 블록까지 붙이기
            pressed.append(count == 1 ? currCut : count + currCut);
            
            // 압축 과정 거친 길이 계산해서 갱신
            answer = Math.min(answer, pressed.length());
        }
        
        return answer;
    }
}