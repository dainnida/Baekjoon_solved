class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] timetable = new int[24 * 60];
        
        for (String[] time : book_time) {
            String[] start = time[0].split(":");
            String[] stop = time[1].split(":");
            
            int start_time = Integer.parseInt(start[0]) * 60 + Integer.parseInt(start[1]);
            int stop_time = Integer.parseInt(stop[0]) * 60 + Integer.parseInt(stop[1]) + 10;
            stop_time = Math.min(stop_time, 24 * 60); // 다음 날 청소 시간은 고려 안함
            
            for(int i = start_time; i < stop_time; i++) {
                timetable[i]++;
                answer = Math.max(timetable[i], answer);
            }
        }         
        
        return answer;
    }
}