import java.io.*;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        // parseInt()는 String을 int로 바꾸기 때문에 toString 사용
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        
        System.out.println(A>B ? A:B);
    }
}