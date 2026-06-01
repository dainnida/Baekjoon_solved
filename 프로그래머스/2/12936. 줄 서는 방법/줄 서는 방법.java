import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            people.add(i);
        
        // 인덱스 매칭을 위해 k 하나 깎기
        k--;
        
        for (int i = 0; i < n; i++) {
            // 뒤에 남은 자리수의 팩토리얼 구하기
            long count = factorial(n - (i + 1));
            
            // 몫에 해당하는 만큼 그룹이 지나감. 사전순이므로 앞에서부터 index번째 숫자.
            int index = (int) (k / count);
            answer[i] = people.get(index);
            
            // 사용한 숫자 제거
            people.remove(index);
            // 나머지만큼 아직 더 돌아봐야 함
            k %= count;
        }
        
        return answer;
    }
    
    public long factorial(int n) {
        long result = 1;
        
        for (int i = 2; i <= n; i++)
            result *= i;
        
        return result;
    }
}