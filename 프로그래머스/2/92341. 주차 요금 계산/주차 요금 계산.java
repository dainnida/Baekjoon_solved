import java.util.*;

class Solution {
    public List<Integer> solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> inTime = new HashMap<>();
        Map<String, Integer> accum = new HashMap<>();
        
        for (String record : records) {
            String[] record_lst = record.split(" ");
            String number = record_lst[1];
            String[] time_lst = record_lst[0].split(":");
            int time = 60*Integer.parseInt(time_lst[0]) + Integer.parseInt(time_lst[1]);
            
            if (record_lst[2].equals("IN"))
                inTime.put(number, time);
            else
                accum.put(number, accum.getOrDefault(number, 0) + time-inTime.remove(number));
        }
        
        // 아직 출차하지 않은 차들
        for (Map.Entry<String, Integer> entry: inTime.entrySet())
            accum.put(entry.getKey(), accum.getOrDefault(entry.getKey(), 0) + 60*23+59-entry.getValue());
        
        // 정렬된 차량 번호 리스트 뽑기
        List<String> numbers = new ArrayList<>(accum.keySet());
        Collections.sort(numbers);
        
        for (String number : numbers) {
            int totalTimes = accum.get(number);
            if (totalTimes > fees[0])
                answer.add(fees[1] + (int) Math.ceil((double) (totalTimes - fees[0]) / fees[2]) * fees[3]);
            else
                answer.add(fees[1]);
        }
        
        return answer;
    }
}