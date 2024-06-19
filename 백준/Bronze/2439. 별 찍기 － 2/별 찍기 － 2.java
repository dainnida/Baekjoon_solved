import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int num = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<=num; i++){
            for(int j=num-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=i; k>0; k--)
                System.out.print("*");
            System.out.println();
        }
    }
}