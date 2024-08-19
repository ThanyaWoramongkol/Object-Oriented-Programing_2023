
public class Account {
    public double balance;
    public String name;
    
    public void deposit(double b){
        if (b >= 0) {
            balance += b;
        } else {
            System.out.println("The balance variable must be greater than or equal to zero");
        }
    }
    
    public double withdraw(double b){
        if (b >= 0 && balance - b >= 0) {
            balance -= b;
        } else if (b <= 0) {
            System.out.println("The balance variable must be greater than or equal to zero");
        } else if (b >= balance) {
            System.out.println("Your account balance is insufficient");
        }
        
        return b;
    }

    public void showInfo(){
        System.out.println(String.format("In %s account, there is a balance equal to %s baht.", name, balance));
    }
}
