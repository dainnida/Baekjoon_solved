import java.util.*;

class Solution {
    public long solution(String expression) {
        long answer = 0;
        
        List<Long> numbers = new ArrayList<>();
        List<Character> operations = new ArrayList<>();
        
        // 문자열에서 숫자만 분리
        String[] numbersArr = expression.split("[+*-]");
        for (String number : numbersArr)
            numbers.add(Long.parseLong(number));
        
        // 문자열에서 연산자만 분리
        String operStr = expression.replaceAll("[0-9]", "");
        for (int i = 0; i < operStr.length(); i++)
            operations.add(operStr.charAt(i));
        
        // 연산자의 우선순위 조합 만들기 (6개뿐이므로 하드코딩)
        char[][] permutations = {
            {'+', '-', '*'},
            {'+', '*', '-'},
            {'-', '+', '*'},
            {'-', '*', '+'},
            {'*', '+', '-'},
            {'*', '-', '+'}
        };
        
        // 조합별로 결괏값 계산하기
        for (char[] permutation : permutations) {
            // 숫자와 연산자 리스트 복사하기(깊은 복사)
            List<Long> numCopy = new ArrayList<>(numbers);
            List<Character> operCopy = new ArrayList<>(operations);
            
            // 우선순위 높은 연산자부터 찾기
            for (char p : permutation) {
                int i = 0;
                // 연산자 리스트를 돌면서 같은 연산자 자리 찾기
                while (i < operCopy.size()) {
                    if (operCopy.get(i) == p) {
                        // 숫자 리스트에서 i+1, i번째 값 빼기
                        long b = numCopy.remove(i + 1);
                        long a = numCopy.remove(i);
                        // 숫자 리스트의 i번째 자리에 계산값 넣기
                        numCopy.add(i, calculate(a, b, p));
                        // 연산자 리스트에서 계산 끝난 연산자 빼기
                        operCopy.remove(i);
                    }
                    else // 연산자를 빼지 않았으므로 다음으로 진입
                        i++;
                }
            }
            long result = Math.abs(numCopy.get(0));
            answer = Math.max(answer, result);
        }
        
        return answer;
    }
    
    public long calculate(long a, long b, char operation) {
        if (operation == '-')
            return a - b;
        else if (operation == '+')
            return a + b;
        else
            return a * b;
        
    }
}