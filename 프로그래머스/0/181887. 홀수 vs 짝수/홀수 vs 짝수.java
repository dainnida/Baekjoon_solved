class Solution {
    public int solution(int[] num_list) {
        int odd = 0, even = 0;
        for (int i = 0; i<num_list.length; i+=2)
            odd += num_list[i];
        for (int j = 1; j<num_list.length; j+=2)
            even += num_list[j];
        if (odd > even)
            return odd;
        return even;
    }
}