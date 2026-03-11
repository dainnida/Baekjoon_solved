class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] lngArr = new int[31];
        for (String str: strArr) {
            lngArr[str.length()]++;
            // if (lngArr[str.length()] > answer)
            //     answer = lngArr[str.length()];
        }
        for (int lng: lngArr)
            answer = Math.max(answer, lng);
        return answer;
    }
}