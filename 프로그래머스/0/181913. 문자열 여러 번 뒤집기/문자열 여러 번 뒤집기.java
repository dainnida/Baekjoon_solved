class Solution {
    public String solution(String my_string, int[][] queries) {
        // for (int[] query: queries) {
        //     String part = my_string.substring(query[0], query[1]+1);
        //     String reversed = new StringBuffer(part).reverse().toString();
        //     my_string = my_string.substring(0, query[0]) + reversed + my_string.substring(query[1]+1);
        // }
        // return my_string;
        
        // StringBuilder의 replace 사용
        StringBuilder sb = new StringBuilder(my_string);
        for (int[] query: queries) {
            String part = sb.substring(query[0], query[1]+1);
            String reversed = new StringBuilder(part).reverse().toString();
            sb = sb.replace(query[0], query[1]+1, reversed);
        }
        return sb.toString();
    }
}