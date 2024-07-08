import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double creditList[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double total_credit = 0;
        double score = 0;

        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(grade.equals("P"))
                continue;
            total_credit += credit;
            int gradeToCredit = Arrays.asList(gradeList).indexOf(grade);
            score += credit * creditList[gradeToCredit];
        }
        System.out.println(score / total_credit);
    }
}
