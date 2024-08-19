
public class IfElseCondition {
    public static void main(String[] args) {
        String fruit = "Banana" ;
        int priceX = 32, priceY = 64 ;
        System.out.print("1 :");
        if (priceX < 30){
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        System.out.print("2 :");
        if (priceY > 30){
            System.out.print("A");
        }
        System.out.println("B");
        System.out.print("3 :");
        if (priceX > 30){
            if (priceY < 60) {
                System.out.print("A");
            } 
        } else {
            System.out.print("B");
        }
        System.out.println("C");
        System.out.print("4 :");
        if (fruit.equals("baNaNa")) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
        System.out.println("C");
        System.out.print("5 :");
        if (fruit.length() == 6) {
            if (priceX * 2 > priceY) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else {
            System.out.println("C");
        }
    }
}
