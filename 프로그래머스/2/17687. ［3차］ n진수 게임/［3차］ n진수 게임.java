class Solution {
    public String change(int n, int q) {
        StringBuilder result = new StringBuilder();
        if (n == 0)
            return "0";
        while (n != 0) {
            if (n % q >= 10)
                result.append((char) ('A' + (n%q) - 10));
            
            else
                result.append(n % q);
            n /= q;
        }
        return result.reverse().toString();
    }
    
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int count = 0;  // n진수로 바꾸어야 할 수
        int total = 1;  //n진수로 바꾼 길이의 총 합
        while (answer.length() <= t) {
            // String strN = change(count, n);
            String strN = Integer.toString(count, n);
            for (int i=0; i<strN.length(); i++) {
                if ((total+i) % m == p % m) // m=p일 때를 위해
                    answer += strN.charAt(i);
            }
            count++;
            total += strN.length();
        }
        return answer.toUpperCase().substring(0, t);
    }
}