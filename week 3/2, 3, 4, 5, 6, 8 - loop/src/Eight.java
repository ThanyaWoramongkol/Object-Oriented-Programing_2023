
public class Eight {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("1 | ");
        for (int j=100; j<=1; j-=10){
            count += 1;
        }
        System.out.println(count);
        
        count = 0;
        System.out.print("2 | ");
        for (int k=2; k<=3; k+=4){
            count += 1;
        }
        System.out.println(count);
        
        count = 0;
        System.out.print("3 | ");
        for (int i = -4; i <= -7; i++){
            count += 1;
        }
        System.out.println(count);
        
        count = 0;
        System.out.print("4 | ");
        for (int x = -10; x <= 10; x-=10){
            count += 1;
        }
        System.out.println(count);
    }
}
