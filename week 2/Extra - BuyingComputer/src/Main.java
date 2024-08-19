import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please insert your monitor size 38 or 43 only");
        int monitor = input.nextInt(), display = 0;
        System.out.println("Do you want DVD-RO? 1 is Yes / 0 is No");
        int rom = input.nextInt();
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        int printer = input.nextInt();
        double cost = 0, computer = 375.99, dvd_rom = 65.99, printer_cost = 125 ;
        
        System.out.println("======= Your order =======");
        System.out.println("* computer >>> " + computer + "$");
        
        if (monitor == 38) {
            cost += 75.99 ;
            display = 38 ;
        } else if (monitor == 43) {
            cost += 99.99 ;
            display = 43 ;
        }
        System.out.println("* "+  display + "'Monitor >>> " + cost + "$");
        
        if (rom == 1) {
            cost += dvd_rom ;
            System.out.println("* DVD-ROM >>> " + dvd_rom + "$");
        }
        if (printer == 1){
            cost += printer_cost ;
            System.out.println("* Printer >>> " + printer_cost + "$");
        }

        System.out.println("======= Total price >>> " + (cost + computer) + " ===========");
    }
}
