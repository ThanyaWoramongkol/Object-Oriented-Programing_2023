package VehicleItems;
public class Plane extends Vehicle {
    public void showPlaneInfo(){
        System.out.println(String.format("Plane detail is, Fuel is %s litre and Top Speed is %s m/s.", this.getFuel(), this.getTopSpeed()));

    }
    
    public void setPlaneInfo(int s, String t){
        this.setFuel(s); this.setTopSpeed(t);
    }
    
    public void fly(){
        if (this.getFuel() >= 200){
            this.setFuel(this.getFuel() - 200);
            System.out.println("Fly.");
        } else { System.out.println("Please add fuel."); }
    }
}
