
public class Pigeous extends Bird{
    public Pigeous(){ super("", 0); }
    public Pigeous(String name, int age) { super(name, age); }
    
    @Override
    public void wingAttack(Animal a) { a.setPower(a.getPower() - 5); }
    public void wingAttack(Animal a, int times){ a.setPower(a.getPower() - (5 * times)); }

    @Override
    public void eat(Food f) { super.setPower(this.getPower() + (f.getPower() * 2)); }

    @Override
    public void fly() { System.out.println(this.getName() + " fly fly ...."); }
    
}
