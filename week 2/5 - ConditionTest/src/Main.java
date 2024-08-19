
public class Main {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;
        System.out.print("1: ");
        if ((num1 % 2) == 0){
            System.out.println("(A) :" + num1 + "|" + num2);
        } else {
            System.out.println("(B) :"+ num1 + "|" + num2);
    }
        System.out.println("End");
        
        System.out.print("2: ");
        if ((2 * num1 + 10) > 0){
            System.out.println("(A) :" + num1 + "|" + num2);
        } else {
            System.out.println("(B) :"+ num1 + "|" + num2);
    }
        System.out.println("End");

        System.out.print("3: ");
        if (((++num1 + 10) > 0) && (6+(--num2) > 10)) {
            System.out.println("(A) :" + num1 + "|" + num2);
        } else {
            System.out.println("(B) :"+ num1 + "|" + num2);
    }
        System.out.println("End");
    }
}
