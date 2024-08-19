
public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name){ this.balance = balance; this.name = name; }
    
    public void setName(String name){ this.name = name; }
    
    public String getName(){ return name; }
    
    public void setBalance(double balance){ this.balance = balance; }
    
    public double getBalance(){ return balance; }
    
    public void deposit(double a){
        if (a >= 0){
            this.setBalance(balance + a);
            System.out.println(String.format("%s baht is deposited to %s.", a, name));
        } else { System.out.println("Input number must be a positive integer."); }
    }
    
    public void withdraw(double a) throws WithdrawException{
        if (a >= 0 && balance - a >= 0){
            this.setBalance(balance - a);
            System.out.println(String.format("%s baht is withdrawn from %s.", a, name));
        } else if (a < 0) { System.out.println("Input number must be a positive integer."); }
        else { throw new WithdrawException("Account " + name + "has not enough money!"); }
    }
    
    public void showAccount(){
        System.out.println(String.format("%s account has %s baht.", name, balance));
    }
//    
//    public static void main(String[] args) {
//        CheckingAccount acct1 = new CheckingAccount(1000, "A0001", 500);
//        Customer cust = new Customer("Sompong", "Sookjai", acct1);
//        cust.getAcct().deposit(500);
//        cust.getAcct().withdraw(1800);
//        cust.getAcct().withdraw(300);
//        cust.getAcct().deposit(1000);
//        cust.getAcct().withdraw(200);
//
//    }
}
