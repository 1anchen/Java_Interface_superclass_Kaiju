package Object.Vehicle;
import Kaiju.*;
import Object.*;

public class NucTank extends Vehicle implements IDamage {

    public NucTank(String type, int healthValue){
        super(type, healthValue);
    }

    public int nucAttack(){
        return  200;
    }

    public void reduceHealth(int attackValue){
        this.healthValue -= attackValue;

    }



}
