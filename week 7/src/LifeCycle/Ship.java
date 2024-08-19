package LifeCycle;
public class Ship extends Vehicle implements Floatable {
    public Ship(double fuel){ this.setFuel(fuel); }
    public Ship() { this.setFuel(0.0); }
    
    public void fl0at(){
        if (this.getFuel() >= 50){
            this.setFuel(this.getFuel() - 50); System.out.println("Ship moves");
        } else { System.out.println("Fuel is not enough."); }
    }
    
    public void startEngine(){
        if (this.getFuel() >= 10){
            this.setFuel(this.getFuel() - 10); System.out.println("Engine starts");
        } else { System.out.println("Fuel is not enough"); }
    }
    
    public void stopEngine(){ System.out.println("Engine stops"); }
    
    public void honk(){ System.out.println("Shhhhh"); }
    
    public void move() { this.fl0at(); }
    
    public void move(int distance){
        for (int count = 1; count <= distance; count++){
            if (this.getFuel() <= 50){ this.fl0at(); break; } else { this.fl0at(); }}
    }
}
