import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = N;

        for(int i=0; i<N; i++){
            String str = br.readLine();
            int[] arr = new int[26];

            for(int j=0; j<str.length(); j++){
                if(j>0 && str.charAt(j-1) == str.charAt(j))
                    continue;
                if(arr[str.charAt(j)-97] == 1){
                    count--;
                    break;
                }
                else
                    arr[str.charAt(j)-97] = 1;
            }
        }
        System.out.println(count);
    }
}
