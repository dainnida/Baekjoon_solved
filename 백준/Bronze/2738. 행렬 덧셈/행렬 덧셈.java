import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        for(int i=0; i<N*2; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int tmp = i;
            if(i>=N)
                tmp -= N;

            for(int j=0; j<M; j++){
                arr[tmp][j] += Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
