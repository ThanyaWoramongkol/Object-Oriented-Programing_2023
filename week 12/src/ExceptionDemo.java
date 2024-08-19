import java.lang.Math;
import java.util.*;
public class ExceptionDemo {
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        List<String> list = Arrays.asList("4", "8", "3");
        try {
            a = Double.parseDouble(list.get(0));
            b = Double.parseDouble(list.get(1));
            c = Double.parseDouble(list.get(2));

            x1 = ((-1 * b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            x2 = ((-1 * b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        } catch ( NumberFormatException ne ){
            System.out.println("Please input data in number format only.");
        } catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Please enter 3 numbers as a,b and c respectively");
        }
//        System.out.println(x1 + "\n" + x2);
    }
}
