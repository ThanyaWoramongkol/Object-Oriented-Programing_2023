package AccountChecking;
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount (){ this(0, "", 0); }

    public CheckingAccount(double balance, String name, double credit){ super(balance, name); this.credit = credit; }

    public void setCredit(double credit){
        if (credit >= 0){ this.credit = credit; }
        else { System.out.println("Input number must be a positive integer."); }
    }
    
    public double getCredit(){ return credit; }
    
    public void withdraw(double a){
        boolean condition = true;
        if (this.balance - a >= 0) { this.setBalance(balance - a); }
        else if (this.balance - a + this.credit >= 0 ) {
            this.setCredit(credit - (a - this.balance));
            super.withdraw(this.balance);
        } else { condition = false; }
        
        if (condition) { System.out.println(String.format("%s baht is withdrawn from %s and your credit balance is %s.", a, this.name, credit)); }
        else { System.out.println("Not enough money!"); }
    }
    
    public void withdraw(String a){ this.withdraw(Double.parseDouble(a)); }
    
    public String toString(){ return String.format("The %s account has %s baht and %s credits.", this.name, this.balance, credit); }

}
