import java.util.*;

class Solution {
    List<List<Integer>> combinations = new ArrayList<>();
    
    public int solution(String[][] relation) {
        List<List<Integer>> keys = new ArrayList<>();
        int cardinality = relation.length;
        int degree = relation[0].length; 
        
        // 조합 만들기
        for (int i = 1; i <= degree; i++) {
            List<Integer> temp = new ArrayList<>();
            backtrack(0, i, degree, temp);
        }
        Collections.sort(combinations, (a, b) -> a.size() - b.size());
        
        for (List<Integer> combination : combinations) {
            Set<List<String>> tuples = new HashSet<>();
            for (int i = 0; i < cardinality; i++) {
                // 후보 키 만들기
                List<String> currKey = new ArrayList<>();
                for (int j = 0; j < combination.size(); j++) {
                    currKey.add(relation[i][combination.get(j)]);
                }
                // 유일성 확인하기
                if (tuples.contains(currKey))
                    break;
                tuples.add(currKey);
            }
            if (tuples.size() == cardinality) { // 유일성 만족
                // 최소성 확인하기
                boolean is_duplicate = false;
                for (List<Integer> key : keys) {
                    if (combination.containsAll(key)) {
                        is_duplicate = true;
                        break;
                    }
                }
                if (!is_duplicate) // 최소성 만족
                    keys.add(combination);
            }
        }
        
        return keys.size();
    }
    
    public void backtrack(int index, int depth, int degree, List<Integer> temp) {
        if (index == depth) {
            if (!combinations.contains(temp)) {
                  combinations.add(new ArrayList<>(temp)); // 훼손되지 않게 새로 할당
            }
            return;
        }
        
        for (int i = index; i < degree; i++) {
            temp.add(i);
            backtrack(i + 1, depth, degree, temp);
            temp.remove(temp.size() - 1); // 백트래킹
        }
    }
}