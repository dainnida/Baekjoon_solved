import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();
        
        hour += time / 60;
        min += time % 60;
        
        // hour>23, min>=60: h-24, m-60, h+1
        // hour>23, min<60: h-24
        // h=<23, m>=60: m-60, h+1 (그런데 h=23이면 h=0이어야 함)
        // h=<23, m>60: ㄱㅊ
        if(min >=  60){
            min -= 60;
            hour++;
        }
        if (hour > 23)
            hour -= 24;
        System.out.println(hour + " " + min);
    }
}