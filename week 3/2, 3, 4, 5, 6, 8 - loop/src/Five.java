
public class Five {
    public static void main(String[] args) {
        System.out.print("5.1) ");
        for (int i = 0; i < 8; i++){
            System.out.print((1 + 3*i) +",");
        }
        System.out.println("");
        
        System.out.print("5.2) ");
        for (int i = 0; i <= 16; i++){
            if (i % 2 == 0){
                System.out.print(i + ",");
            }
        }
        System.out.println("");
        
        System.out.print("5.3) ");
        for (int i = 0; i < 6; i++) {
            System.out.print((i*2 + 1) + ",");
        }
        System.out.println("");
    }
}
