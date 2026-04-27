import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> numbers = new HashSet(Arrays.asList(phone_book));
        
        for (String number : numbers) {
            for (int i = 1; i < number.length(); i++) {
                 String prefix = number.substring(0, i);
                 if (numbers.contains(prefix)) // 해당 전화번호가 접두사라면 
                     return false;
            }
        }
        return true;
    }
}