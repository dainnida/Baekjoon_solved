import java.util.*;

class Solution {
    List<String> dictionary = new ArrayList<>();
    String[] vowels = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        dfs("");
        
        return dictionary.indexOf(word);
    }
    
    private void dfs(String curr) {
        dictionary.add(curr);

        if (curr.length() == 5)
            return;

        for (int i = 0; i < 5; i++) {
            dfs(curr + vowels[i]);
        }
    }
}