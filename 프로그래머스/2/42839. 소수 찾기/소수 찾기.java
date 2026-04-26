import java.util.*;

class Solution {
    int answer = 0;
    Set<Integer> s = new HashSet<>();
    boolean[] visited;
    
    public int solution(String numbers) {
        String[] nums = numbers.split("");
        visited = new boolean[nums.length];
        combination(nums, "");
        
        for (int paper : s) {
            if (checkPrime(paper))
                answer++;
        }
        
        return answer;
    }
    
    private void combination(String[] nums, String curr) {
        if (!curr.equals(""))
            s.add(Integer.parseInt(curr));
        
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(nums, curr+nums[i]);
                visited[i] = false;
            }
        }
    }
    
    private boolean checkPrime(int n) {
        if (n == 0 || n == 1)
            return false;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}