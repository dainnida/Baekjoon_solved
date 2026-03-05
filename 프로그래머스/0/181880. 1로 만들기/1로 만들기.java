class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String bin = "";
        for (int i: num_list) {
            bin = Integer.toBinaryString(i);
            answer += bin.length()-1;
        }
        return answer;
    }
}