// Lab03 | 11.)
import java.util.Scanner;
public class ManyLineCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int number = input.nextInt();
        for ( int i = 1; i <= number; i++ ){
            if (i % 5 == 0){
                System.out.println("|");
            } else {
                System.out.print("|");
            }
        }
        System.out.println("");
    }
}
