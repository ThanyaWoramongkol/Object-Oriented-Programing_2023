import java.util.* ;
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Insert your name  :  ");
        String name = input.nextLine() ;
        System.out.print("Please Insert your age  :  ");
        int age = input.nextInt(), salary = 0 ;
        System.out.print("Please Insert number of working days  :  ");
        int numDay1 = input.nextInt() ;
        System.out.print("Please Insert number of absent days  :  ");
        int numDay2 = input.nextInt() ;
        System.out.print("Please Insert your body weight  :  ");
        double weight = input.nextDouble() ;
        if ((age > 20) && (age <= 30)){
            salary += (numDay1 * 300) - (numDay2 * 50);
        } else if ((age > 30) && (age <= 40)){
            salary +=  (numDay1 * 500) - (numDay2 * 50);
        } else if ((age > 40) && (age <= 50)){
            salary += (numDay1 * 1000) - (numDay2 * 25);
        } else if ((age> 50) && (age <= 60)){
            salary += numDay1 * 3000;
        }
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + "Baht");
        if ((weight >= 10) && (weight <= 60)){
            salary += 5000;
        } else if ((weight > 60) && (weight <= 90)){
            salary += (5000 - (weight - 60) * 10);
        }
        System.out.println("Your salary and bonus is " + salary + "Baht");
    }
    
}
