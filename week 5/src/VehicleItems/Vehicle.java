package VehicleItems;
public class Vehicle {
    private int fuel;
    private String topSpeed;
    
    protected void setFuel(int i){
        fuel = i;
    }
    
    protected void setTopSpeed(String n){
        topSpeed = n;
    }
    
    protected int getFuel(){
        return fuel;
    }
    
    protected String getTopSpeed(){
        return topSpeed;
    }
    
    public void showInfo(){
        System.out.println(String.format("Fuel is %s litre and Top Speed is %s m/s.", this.getFuel(), this.getTopSpeed()));
    }
}
