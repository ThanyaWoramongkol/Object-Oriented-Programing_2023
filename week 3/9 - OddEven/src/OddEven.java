// Lab03 | 9.)
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumnuan, odd = 0, even = 0;
        while (true) {
            jumnuan = input.nextInt();
            if (jumnuan == -1){
                break;
            } else if (jumnuan % 2 == 1){
                odd++;
            } else {
                even++;
            }
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
