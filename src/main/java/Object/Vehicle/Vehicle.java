package Vehicle;

public abstract class Vehicle {
    protected String type;
    protected int healthValue;

    public Vehicle(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType(){
        return this.type;
    }

    public int getHealthValue(){
        return this.healthValue;
    }

}
