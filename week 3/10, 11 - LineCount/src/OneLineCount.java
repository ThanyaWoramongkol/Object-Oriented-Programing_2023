// Lab03 | 10.)
import java.util.Scanner;
public class OneLineCount {
    public static void main(String[] args) {
        System.out.print("Please insert a number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0){
                System.out.print("/");
            } else {
                System.out.print("|");
            }
        }
        System.out.println("");
    }
}
