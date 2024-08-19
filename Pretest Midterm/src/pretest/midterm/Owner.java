
public class Owner {
    protected final String name;
    protected Animal animal;
    
    public Owner(){ this("", null); }
    public Owner(String name){ this(name, null);}
    public Owner(Animal animal){ this("", animal); }
    public Owner(String name, Animal animal){ this.name = name; this.animal = animal; }
    
    public String getName(){ return name; }
    
    public void setAnimal(Animal animal){ this.animal = animal; }
    
    public Animal getAnimal(){ return animal; }
    
    public void feedFood(Food f){
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.eat(f);
        } else { 
            Pigeous p = (Pigeous) animal;
            p.eat(f);
        }
    }
    
    @Override
    public String toString(){return "Owner : name = " + name + ", " + animal.toString();}
    
    public void protectOwnerFrom(Animal a){
        if (a instanceof Dog){
            Dog dog = (Dog) a;
            dog.kick(a);
        } else { 
            Pigeous p = (Pigeous) a;
            p.wingAttack(a);
        }
    }
}
