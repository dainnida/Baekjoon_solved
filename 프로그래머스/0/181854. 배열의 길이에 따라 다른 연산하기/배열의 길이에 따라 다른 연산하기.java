class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        for (int i = 0; i < len; i += 2) {
            if (len % 2 == 0 && i+1 < len)
                arr[i+1] += n;
            else if (len % 2 != 0)
                arr[i] += n;
        }
        return arr;
    }
}