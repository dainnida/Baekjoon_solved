import java.util.*;

class Solution {
    int[] answer = new int[2];
    int[] sales; // 각 이모티콘의 할인율 저장
    int[] saleRates = new int[]{10, 20, 30, 40};
    
    public int[] solution(int[][] users, int[] emoticons) {
        int n = users.length, m = emoticons.length;
        sales = new int[m]; // 각 이모티콘의 할인율 저장
        
        dfs(0, m, users, emoticons);
        
        return answer;
    }
    
    public void dfs(int index, int m, int[][] users, int[] emoticons) {
        if (index == m) { // 다 채움
            
            // 플러스 가입자와 이모티콘 판매액 계산하기
            int[] tempResult = new int[2];
            for (int[] user : users) {
                int price = 0;
                for (int i = 0; i < m; i++) {
                    if (sales[i] >= user[0]) { // 비율 이상의 할인율
                        price += emoticons[i] * (100 - sales[i]) / 100;
                    }
                }
                if (price >= user[1]) // 가격 이상의 돈을 이모티콘 구매에 사용
                    tempResult[0]++; // 이모티콘 플러스 서비스에 가입
                else
                    tempResult[1] += price; // 이모티콘을 모두 구매
            }
            
            // 목표에 더 가까우면 갱신
            if (tempResult[0] > answer[0]
                || tempResult[0] == answer[0] && tempResult[1] > answer[1]) {
                answer[0] = tempResult[0];
                answer[1] = tempResult[1];
            }
            
            return;
        }
        
        // 각 이모티콘에 4개의 할인율 다 채워봄
        for (int saleRate : saleRates) {
            sales[index] = saleRate;
            dfs(index + 1, m, users, emoticons);
        }
    }
}