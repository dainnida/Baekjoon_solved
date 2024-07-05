import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int[] arr = new int[26];
        int max = -1;
        char c = '?';

        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'A']++;
        }
        
        for(int i=0; i<26; i++){
            if(max<arr[i]){
                max = arr[i];
                c = (char)(i+'A');
            }
            else if(max==arr[i]){
                c = '?';
            }
        }
        System.out.println(c);
    }
}
