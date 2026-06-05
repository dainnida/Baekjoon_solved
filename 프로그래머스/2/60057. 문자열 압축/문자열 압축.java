import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();
            
        int last = s.length() / 2;
        for (int divisor = 1; divisor <= last; divisor++) {
            String pressed = "";
            String currCut = s.substring(0, divisor);
            int count = 1;
            
            int i;
            for (i = divisor; i < s.length() - divisor; i += divisor) {
                String nextCut = s.substring(i, i + divisor);
                if (currCut.equals(nextCut)) { // 문자가 반복됨
                    count++;
                    continue;
                }
                // 문자가 반복되지 않거나 압축이 끝났음
                if (count == 1) // 문자가 반복되지 않음
                    pressed += currCut;
                else // 압축이 끝났음
                    pressed += String.valueOf(count) + currCut;
                
                // 현재부터 다시 압축되는지 세기
                currCut = nextCut;
                count = 1;
            }
            // if (count != 1) // 마지막까지 문자가 반복됨
            //     pressed += String.valueOf(count) + currCut;
            // else // 아니면 그대로 붙여
            //     pressed += currCut;
            
            // 마지막은 길이가 부족할 수도 있음
            String lastCut = s.substring(i, s.length());
            // 마지막까지 문자가 반복됨
            if (currCut.equals(lastCut)) 
                pressed += String.valueOf(count + 1) + currCut;
            // 아니면 전 거랑 현재 거 다 붙임
            else if (count == 1) // 전 거 반복되지 않았음
                pressed += currCut + lastCut;
            else // 전 거 반복됨
                pressed += String.valueOf(count) + currCut + lastCut;
            
            // 압축 과정 거친 길이 계산해서 갱신
            answer = Math.min(answer, pressed.length());
        }
        
        return answer;
    }
}