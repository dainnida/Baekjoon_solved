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
            long count = factorial(n - 1 - i);
            
            int index = (int) (k / count);
            answer[i] = people.get(index);
            
            // 사용한 숫자 제거
            people.remove(index);
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