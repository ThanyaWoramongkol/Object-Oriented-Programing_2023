package VehicleItems;
public class Car extends Vehicle{
    private String typeEngine;
    
    public void setTypeEngine(String t){
        typeEngine = t;
    }
    
    public String getTypeEngine(){
        return typeEngine;
    }
    
    public void showCarInfo(){
        System.out.println("Car engine is " + this.typeEngine + ".");
        System.out.println(String.format("Fuel is %s litre and Top Speed is %s m/s.", this.getFuel(), this.getTopSpeed()));
    }
    
    public void setCarInfo(int s, String t, String y){
        this.setFuel(s); this.setTopSpeed(t); this.setTypeEngine(y);
    }
    
    public void move(){
        if (this.getFuel() >= 50){
            this.setFuel(this.getFuel() - 50);
            System.out.println("Move.");
        } else { System.out.println("Please add fuel."); }
    }
}
