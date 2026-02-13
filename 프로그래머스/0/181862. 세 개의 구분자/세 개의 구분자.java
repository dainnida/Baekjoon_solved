class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        String filterStr = myStr.replaceAll("[abc]", " ").trim();
        if (filterStr.isEmpty())
            answer = new String[]{"EMPTY"};
        else
            answer = filterStr.split("\\s+");
        return answer;
    }
}