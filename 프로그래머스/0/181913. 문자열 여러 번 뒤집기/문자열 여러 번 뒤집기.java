class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] query: queries) {
            String part = sb.substring(query[0], query[1]+1);
            String reversed = new StringBuilder(part).reverse().toString();
            sb = sb.replace(query[0], query[1]+1, reversed);
        }
        return sb.toString();
    }
}