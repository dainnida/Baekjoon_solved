import java.util.*;

class Solution {
    public List<String> solution(String[] orders, int[] course) {
        List<String> answer = new ArrayList<>();
            
        for (int r : course) {
            Map<String, Integer> menus = new HashMap<>();

            for (String order : orders) {
                if (order.length() < r)
                    continue;
                
                char[] orderList = order.toCharArray();
                Arrays.sort(orderList);

                List<String> combos = combination(orderList, r);
                for (String combo : combos)
                    menus.put(combo, menus.getOrDefault(combo, 0)+1);
            }
            
            if (menus.isEmpty())
                continue;
            
            int maxValue = Collections.max(menus.values());
            if (maxValue >= 2) {
                for (Map.Entry<String, Integer> menu : menus.entrySet()) {
                    if (menu.getValue() == maxValue)
                        answer.add(menu.getKey());
                }
            }
        }
        
        Collections.sort(answer);
        return answer;
    }
    
    private List<String> combination(char[] list, int r) {
        List<String> result = new ArrayList<>();

        backtrack(list, result, new StringBuilder(), 0, r);
        
        return result;
    }
    
    private void backtrack(char[] list, List<String> result, StringBuilder sb, int start, int r) {
        if (sb.length() == r) {
            result.add(sb.toString());
            return;
        }
        
        for (int i = start; i < list.length; i++) {
            sb.append(list[i]);
            backtrack(list, result, sb, i + 1, r);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}