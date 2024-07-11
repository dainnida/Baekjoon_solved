import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] arr = new boolean[100][100];
        int n = Integer.parseInt(br.readLine());
        int area = 0;

        for(int k=0; k<n; k++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            for(int i=width-1; i<width+9; i++){
                for(int j=height-1; j<height+9; j++){
                    if(!arr[i][j]){
                        arr[i][j] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}
