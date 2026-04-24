import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        Set<Integer> set = new HashSet<>();
        int[][] dp = new int[len+1][len]; // 행: 부분 수열 길이, 열: 수열 시작 인덱스
        // int[] round = new int[len * 2 - 1];
        // for (int i = 0; i < len * 2 - 1; i++)
        //     round[i] = elements[i % len];

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < len; j++) {
                // dp[i][j] = dp[i-1][j] + round[i+j-1];
                dp[i][j] = dp[i-1][j] + elements[(i+j-1) % len];
                set.add(dp[i][j]);
            }
        }
        return set.size();
    }
}