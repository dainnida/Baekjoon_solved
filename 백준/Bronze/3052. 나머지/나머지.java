//배열 사용
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];
        
        for(int i=0; i<10; i++){
            int mod = Integer.parseInt(br.readLine()) % 42;
            arr[mod] = 1;
        }
        
        int count = 0;
        for(int i=0; i<42; i++){
            if(arr[i] == 1)
                count++;
        }
        System.out.println(count);
    }
}