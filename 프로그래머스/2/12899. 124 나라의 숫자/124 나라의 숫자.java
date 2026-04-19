class Solution {
    public String solution(int n) {
        String answer = "";
        //3진법의 0 -> 124수의 4, 1 -> 1, 2 - > 2
        String[] num = new String[] {"4", "1", "2"};
        
        while (n > 0) {
            int rest = n % 3;
            answer = num[rest] + answer;
            n /= 3;
            if (rest == 0)
                n--;
        }
        return answer;
    }
}