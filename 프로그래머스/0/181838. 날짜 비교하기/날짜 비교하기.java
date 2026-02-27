import java.time.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        // for (int i=0; i<2; i++) {
        //     if (date1[i] < date2[i])
        //         return 1;
        //     if (date1[i] > date2[i])
        //         return 0;
        // }
        // if (date1[2] < date2[2])
        //     return 1;
        // return 0;
        
        LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
        
        if (dateA.isBefore(dateB))
            return 1;
        return 0;
    }
}