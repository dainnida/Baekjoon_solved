import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);

        System.out.println(((str.equals(sb.reverse().toString())) ? 1 : 0));
        br.close();
    }
}

