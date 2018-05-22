package Kaiju;
import Object.IDamage;

import java.util.Random;

public class Knifehead extends Kaiju {

    public Knifehead(String name, String type, int healthValue, int attackPower){
        super(name,type,healthValue,attackPower);

    }

    public String roar(){
        return "KooKoo";
    }

    public void attack(IDamage object){

        object.reduceHealth(this.attackPower * fly());

    }

    public int fly() {
        if (canFly()) {
            return 3;
        }
        return 1;
    }

    public boolean canFly(){
        Random ran = new Random();
        int factor= ran.nextInt(1) + 9;
        if(factor > 6){
            return true;
        }
        return false;
    }





}
