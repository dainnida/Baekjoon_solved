import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int n = (int)str.charAt(0);
		
		br.close();
		System.out.println(n);
	}
}