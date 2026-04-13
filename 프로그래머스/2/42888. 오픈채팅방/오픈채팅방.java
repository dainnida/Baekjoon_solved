import java.util.*;

class Solution {
    public List<String> solution(String[] record) {
        List<String> answer = new ArrayList<>();
        Map<String, String> dic = new HashMap<>();
        
        for (String r : record) {
            String[] data = r.split(" ");
            if (data[0].equals("Enter") || data[0].equals("Change"))
                dic.put(data[1], data[2]);
        }
        
        for (String r : record) {
            String[] data = r.split(" ");
            if (data[0].equals("Enter"))
                answer.add(dic.get(data[1]) + "님이 들어왔습니다.");
            else if (data[0].equals("Leave"))
                answer.add(dic.get(data[1]) + "님이 나갔습니다.");
        }
        
        return answer;
    }
}