
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount (){ this(0, "", 0); }

    public CheckingAccount(double balance, String name, double credit){ super(balance, name); this.credit = credit; }

    public void setCredit(double credit){
        if (credit >= 0){ this.credit = credit; }
        else { System.out.println("Input number must be a positive integer."); }
    }
    
    public double getCredit(){ return credit; }
    
    @Override
    public void withdraw(double a) throws WithdrawException{
        boolean condition = true;
        if (this.balance - a >= 0) { this.setBalance(balance - a); }
        else if (this.balance - a + this.credit >= 0){
            this.setCredit(credit - (a - this.balance));
            super.setBalance(this.balance - a);
        } else { condition = false; }
               
        if (condition) { System.out.println(String.format("%s baht is withdrawn from %s your credit balance is %s.", a, this.name, credit)); }
        else { throw new WithdrawException("Account " + name + " has not enough money!"); }
    }
    
    public void withdraw(String a) throws WithdrawException{ this.withdraw(Double.parseDouble(a)); }
    
    @Override
    public String toString(){ return String.format("The %s account has %s baht and %s credits.", this.name, this.balance, credit); }

}
