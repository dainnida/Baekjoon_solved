class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String i : order) {
            if (i.contains("cafelatte"))
                answer += 5000;
            else
                answer += 4500;
        }
        return answer;
    }
}