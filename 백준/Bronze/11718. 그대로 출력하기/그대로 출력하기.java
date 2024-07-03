import java.io.*;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        while((str=br.readLine()) != null){
            System.out.println(str);
        } 
        br.close();
    }
}