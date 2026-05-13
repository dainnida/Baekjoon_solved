class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            
            String numberBin = Long.toBinaryString(numbers[i]);
            int numberLen = numberBin.length();
            
            for (int j = numberLen - 1; j >= 0; j--) {
                
                if (numberBin.charAt(j) == '0') {
                    String result = "";
                    if (j == numberLen - 1)
                        result = numberBin.substring(0, j) + "1" + numberBin.substring(j+1, numberLen);
                    else
                        result = numberBin.substring(0, j) + "10" + numberBin.substring(j+2, numberLen);
                    answer[i] = Long.parseLong(result, 2);
                    break;
                }
            }
            
            if (answer[i] == 0) {
                String result = "10" + numberBin.substring(1, numberLen);
                answer[i] = Long.parseLong(result, 2);
            }
        }
        
        return answer;
    }
}