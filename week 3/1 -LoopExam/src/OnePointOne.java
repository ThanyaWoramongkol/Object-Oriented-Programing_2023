
public class OnePointOne {
    public static void main(String[] args) {
        int min = 10, max = 20;
        System.out.print("1.1 : ");
        for (int i = 1; i < min; i++){
            System.out.print("X");
        }
        System.out.println("");
        
        System.out.print("1.2 : ");
        for (int i = max; i > min; i--){
            System.out.print("X");
        }
        System.out.println("");
        
        System.out.print("1.3 : ");
        while (min == 15){
            System.out.print("X");
            min = max;
        }
        System.out.println("");
        
        System.out.print("1.4 : ");
        int x = 0;
        while (x < min){
            System.out.print("X");
            x = x + 1;
        }
        System.out.println("");
        
        System.out.print("1.5 : ");
        for (int i = 0; i < max; i++){
            if (i % 4 == 0){
                System.out.print("X");
            }
        }
        System.out.println("");
    }
}
