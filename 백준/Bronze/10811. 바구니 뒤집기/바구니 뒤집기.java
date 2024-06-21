import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken()) - 1;
            int fin = Integer.parseInt(st.nextToken()) - 1;
            
            while(start < fin) {
                int temp = arr[start];
                arr[start] = arr[fin];
                arr[fin] = temp;
                start++;
                fin--;
            }
        }
        for(int i=0; i<N; i++)
            System.out.print(arr[i] + " ");
    }
}