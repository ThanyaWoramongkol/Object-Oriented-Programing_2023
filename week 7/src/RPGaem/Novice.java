package RPGaem;
public class Novice extends Player{
    public Novice(){
        this.setATK(5); this.setHP(10); this.setMP(10);
    }
    
    public void addEquipment(Item i){ i.use(this); }
    
    public void attack(Player p){ /*this.attacked(0);*/ }
    
    public void attacked(double n){ this.setHP(this.getHP() - n); }
}
