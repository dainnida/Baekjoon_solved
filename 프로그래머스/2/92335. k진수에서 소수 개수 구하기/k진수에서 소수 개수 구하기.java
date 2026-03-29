class Solution {
    public boolean isPrime(long n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;
        for (long i=2; i<Math.sqrt(n)+1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    public int solution(int n, int k) {
        int answer = 0;
        String nString = Integer.toString(n, k);
        String[] nArray = nString.split("0+");
        for (String s: nArray) {
            if (isPrime(Long.parseLong(s)))
                answer++;
        }
        return answer;
    }
}