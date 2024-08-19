import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;
    
    public Customer(){ this("", ""); }
    public Customer(String firstName, String lastName){
        this.firstName = firstName; this.lastName = lastName; acct = new ArrayList();
    }

    public void addAccount(Account acct){ this.acct.add(acct); numOfAccount++; }
    public Account getAccount(int index){ return (Account) acct.get(index); }
    
    public int getNumOfAccount(){ return acct.size(); }

    public void setFirstName(String firstName){ this.firstName = firstName; }
    public String getFirstName(){ return this.firstName; }
    
    public void setLastName(String lastName){ this.lastName = lastName; }
    public String getLastName(){ return this.lastName; }
    
    @Override
    public String toString(){
        return String.format("%s %s has %s account.", this.getFirstName(), this.getLastName(), this.getNumOfAccount());
//        else{ return String.format("The %s account has %s baht and %s credits.", this.getFirstName(), this.getAcct().getBalance(), this.getAcct().getCredit()); }
    }
    
    public boolean equals(Customer c){
        return (this.firstName.equals(c.getFirstName()) && this.lastName.equals(c.getLastName()));
    }
    
    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        
        cust.addAccount(acct1); cust.addAccount(acct2);
        
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        
        System.out.println(cust);
//        for (int i=0; i < cust.getNumOfAccount(); i++){
//            cust.getAccount(i).showAccount();
//        }
    }
}

