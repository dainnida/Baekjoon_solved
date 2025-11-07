class Solution {
    public int solution(int a, int b) {
        int sum = Integer.valueOf(a+""+b);
        int answer = (sum > 2*a*b) ? sum : 2*a*b;
        return answer;
    }
}