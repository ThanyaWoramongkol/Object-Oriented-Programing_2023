
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    
    public boolean equals(Employee e){
        return (e.equals(name) ? true: false);
    }
    
    @Override
    public String toString(){
        return String.format("My name is %s. \nI have %s energy left.\nI have a balance of %s baht.", name, energy, wallet.getBalance());
    }
    
    public boolean buyFood(Seller s){
        Food food = s.sell(this);
        if (food != null){ this.eat(food); return true; }
        else { return false; }
    }
    
    public void eat(Food f){ energy += f.getEnergy(); }
    
    public String getName(){ return name; }
    
    public void setName(String name){ this.name = name; }
    
    public Wallet getWallet(){ return wallet; }
    
    public void setWallet(Wallet wallet){ this.wallet = wallet; }
    
    public int getEnergy(){ return energy; }
    
    public void setEnergy(int energy){ this.energy = energy; }
    
    public static String getNationality(){ return Employee.nationality; }
    
    public static void setNationality(String nationality){ Employee.nationality = nationality; }
}
