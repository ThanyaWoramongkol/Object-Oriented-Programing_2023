import java.util.*;
public class DepositWithInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = input.nextDouble(), inc = 0;
        char bank ;
        System.out.print("Input your account type(Please type A b C or X in uppercase) : ");
        bank = input.next().charAt(0);
        if (bank == 'A'){
            inc = money * 1.015 ;
        } else if (bank == 'B'){
            inc = money * 1.02 ;
        } else if (bank == 'C'){
            inc = money * 1.015 ;
        } else if (bank == 'X'){
            inc = money * 1.05 ;
        }
        System.out.println("Your total money in one year = " + inc);
    }
}