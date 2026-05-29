import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int len = arrayA.length;
        boolean ableOne = true, ableTwo = true;
        
        // 1번 검사 : 철수의 모든 카드 나누는 수 구하기
        int gcdA = arrayA[0];
        for (int i = 1; i < len; i++) {
            gcdA = gcd(gcdA, arrayA[i]);
        }
        
        // 1번 검사 : 그 수로 영희의 카드를 나눌 수 있는지 확인
        if (gcdA == 1)
            ableOne = false;
        for (int b : arrayB) {
            if (b % gcdA == 0)
                ableOne = false;
        }
        
        // 2번 검사 : 영희의 모든 카드 나누는 수 구하기
        int gcdB = arrayB[0];
        for (int i = 1; i < len; i++) {
            gcdB = gcd(gcdB, arrayB[i]);
        }
        // 2번 검사 : 그 수로 철수의 카드를 나눌 수 있는지 확인
        if (gcdB == 1)
            ableTwo = false;
        for (int a : arrayA) {
            if (a % gcdB == 0)
                ableTwo = false;
        }
        
        if (!ableOne && !ableTwo) // 1, 2 다 불가
            return 0;
        else if (ableOne && !ableTwo) // 1만 가능
            return gcdA;
        else if (!ableOne && ableTwo) // 2만 가능
            return gcdB;
        return Math.max(gcdA, gcdB);
    }
    
    public int gcd(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}