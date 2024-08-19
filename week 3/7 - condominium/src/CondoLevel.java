// Lab03 | 7.)
import java.util.Scanner;
public class CondoLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input length of condo: ");
        int level = input.nextInt() ;
        for (int x = 1; x <= level; x++){
            System.out.println("#-#-#-#-#");
        }
    }
}
