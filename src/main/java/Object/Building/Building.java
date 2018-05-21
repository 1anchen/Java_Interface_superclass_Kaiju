package Object.Building;
import Object.*;
import Kaiju.*;

public class Building implements IDamage{

    protected int healthValue;

    public Building(){
        this.healthValue = 200;
    }

    public int getHealthValue(){
        return this.healthValue;
    }

    public void reduceHealth(Kaiju kaiju){
        this.healthValue -= kaiju.getAttackPower();

    }
}
