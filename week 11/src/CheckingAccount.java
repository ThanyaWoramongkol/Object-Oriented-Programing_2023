
public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount(){
        super(0.0, ""); this.credit = 0.0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name); this.credit = credit;
    }
    
    public void setCredit(double credit){
        if (credit > 0){ System.out.println("Input number must be a positive integer."); }
        else{ this.credit = credit; }
    }
    
    public double getCredit(){ return this.credit; }
    
    @Override
    public void withdraw(double a){
        boolean condition = true;
        if (super.balance - a >= 0) { super.withdraw(a); }
        else if (this.balance - a + this.credit >= 0 ) {
            this.setCredit(credit - (a - this.balance));
            super.withdraw(this.balance);
        } else { condition = false; }
        
        if (condition) { System.out.println(String.format("%s baht is withdrawn from %s and your credit balance is %s.", a, this.name, credit)); }
        else { System.out.println("Not enough money!"); }
    }
    
    public void withdraw(String a){ this.withdraw(Double.parseDouble(a)); }
    
    @Override
    public String toString(){
        return String.format("The %s account has %s baht and %s credits.", super.getName(), super.getBalance(), this.getCredit());
    }
}
