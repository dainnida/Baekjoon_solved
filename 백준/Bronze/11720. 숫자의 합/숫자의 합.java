import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        
        int sum = 0;
        
        for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');	// or -48
		}
        
        System.out.println(sum);
        br.close();
    }
}
