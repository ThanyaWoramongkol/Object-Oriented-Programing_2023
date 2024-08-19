
public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    
    public void setName(String name){ this.name = name; }
    
    public String getName(){ return this.name; }
    
    public void setBalance(double balance){ this.balance = balance; }
    
    public double getBalance(){ return this.balance; }
    
    public void deposit(double a){
        if (this.getBalance() > 0){
            this.setBalance(this.getBalance() + a);
            System.out.println(String.format("%s baht is deposited to %s.", a, this.name));
        } else { System.out.println("Input number must be a positive integer."); }
    }
    
    public void withdraw(double a){
        if ( a < 0){ System.out.println("Input number must be a posittive integer."); }
        else if (this.getBalance() - a < 0){ System.out.println("Not enough money!"); }
        else {
            this.setBalance(this.getBalance() - a);
            System.out.println(String.format("%s baht is withdrawn from %s.", a, this.name));
        }
    }
    
    public void showAccount(){
        System.out.println(String.format("%s account has %s baht.", this.getName(), this.getBalance()));
    }
    
    /* public static void main(String[] args) {
        Account a1 = new Account(50000, "66070091");
        a1.showAccount(); a1.deposit(500); a1.showAccount(); a1.withdraw(40000); a1.showAccount();
    } */
}


