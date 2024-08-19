import java.util.Scanner ;
public class SecondCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int hour, minute = 0;
        System.out.println("Hours : ");
        minute += input.nextInt() * 60 ;
        System.out.println("Minutes : ");
        minute += input.nextInt() ;
        System.out.println("Secs : " + (minute * 60));
    }
}
