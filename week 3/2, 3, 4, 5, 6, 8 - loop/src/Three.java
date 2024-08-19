
public class Three {
    public static void main(String[] args) {
        System.out.print("result : ");
        for (int x = -10; x < 10; x+=2) {
            System.out.print(2+3*x);
        }
        System.out.println("");
        for (int x = -10; x < 10; x+=2) {
            System.out.println(x + "|" + (2+3*x));
        }
    }
}
