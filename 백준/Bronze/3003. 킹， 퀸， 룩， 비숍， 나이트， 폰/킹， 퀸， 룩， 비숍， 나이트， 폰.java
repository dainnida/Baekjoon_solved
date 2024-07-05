import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<2; i++){
            int n = Integer.parseInt(st.nextToken());
            System.out.print(1-n + " ");
        }
        for(int i=0; i<3; i++){
            int n = Integer.parseInt(st.nextToken());
            System.out.print(2-n + " ");
        }
        int n = Integer.parseInt(st.nextToken());
        System.out.print(8-n);
    }
}