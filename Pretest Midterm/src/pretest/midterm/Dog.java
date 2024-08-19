
public class Dog extends Animal{
    public Dog(String name, int age){ this.setName(name); this.setPower(200); this.setAge(age); }
    
    @Override
    public void eat(Food f){ super.setPower(this.getPower() + (f.getPower())); }
    
    public void kick(Animal a){ a.setPower(a.getPower() - 5); }
}
