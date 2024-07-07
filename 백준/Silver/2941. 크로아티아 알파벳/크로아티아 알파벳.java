import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count=0;
        int len = str.length();

        for(int i=0; i<len; i++){
            count++;
            switch (str.charAt(i)) {
                case 'c':
                    if(i < len-1 && (str.charAt(i+1) == '-' || str.charAt(i+1) == '=')){
                        i++;
                    }
                    break;
                case 'd':
                    if (i < len-2 && str.charAt(i+1) == 'z' && str.charAt(i+2) == '='){
                        i+=2;
                    }
                    else if (i < len-1 && str.charAt(i+1) == '-'){
                        i++;
                    }
                    break;
                case 'l':
                case 'n':
                    if(i < len-1 && str.charAt(i+1) == 'j'){
                        i++;
                    }
                    break;
                case 's':
                case 'z':
                    if(i < len-1 && str.charAt(i+1) == '='){
                        i++;
                    }
                    break;
            }
        }
        System.out.println(count);
    }
}
