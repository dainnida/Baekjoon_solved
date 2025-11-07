import java.util.*;

class Solution {
    public List solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] scores = new int[3];
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == a[i%a.length])
                    scores[0]++;
            if (answers[i] == b[i%b.length])
                    scores[1]++;
            if (answers[i] == c[i%c.length])
                    scores[2]++;
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        for (int i=0; i<scores.length; i++){
            if (scores[i] == maxScore)
                answer.add(i+1);
        }
        return answer;
    }
}