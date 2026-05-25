import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        // int[]을 내림차순: int[]를 먼저 오름차순 후 뒤집기
        Arrays.sort(citations);
        for (int i = 0; i < citations.length / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[citations.length - i - 1];
            citations[citations.length - i - 1] = temp;
        }
        
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= i + 1) // h번 이상 인용된 논문이 h편 이상
                answer = i + 1;
            else
                break;
        }
        
        return answer;
    }
}