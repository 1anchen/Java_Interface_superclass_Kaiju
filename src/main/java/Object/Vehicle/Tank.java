package Object.Vehicle;
import Object.*;
import Kaiju.*;

public class Tank extends Vehicle implements IDamage {

    public Tank(String type, int healthValue){
        super(type, healthValue);
    }

    public int cannonBallAttack(){
        return  20;
    }

    public void reduceHealth(int attackValue){
        this.healthValue -= attackValue;

    }
}
