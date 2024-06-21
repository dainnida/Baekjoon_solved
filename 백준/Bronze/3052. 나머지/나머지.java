//BufferedReader + HashSet 사용
import java.io.*;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0; i<10; i++){
            int mod = Integer.parseInt(br.readLine()) % 42;
            hs.add(mod);
        }
        System.out.println(hs.size());
    }
}