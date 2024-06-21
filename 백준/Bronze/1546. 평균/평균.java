// 배열 사용
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        double max = Double.MIN_VALUE;
        double sum = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            double a = Double.parseDouble(st.nextToken());
            arr[i] = a;
            max = Math.max(max, a);
            sum += a;
        }
        System.out.print(sum / (double)N / max*100);
    }
}