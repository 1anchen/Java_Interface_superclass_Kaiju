package Kaiju;
import Object.IDamage;

import java.util.Random;

public class Leatherback extends Kaiju{

    public Leatherback(String name, String type, int healthValue, int attackPower){
        super(name,type,healthValue,attackPower);

    }

    public String roar() {
        return "LaaLaa";
    }

    public void attack(IDamage object){
        object.reduceHealth(this.attackPower*jump());
    }


    public int jump() {
        if (canJump()) {
            return 2;
        }
        return 1;
    }

    public boolean canJump(){
        Random ran = new Random();
        int factor= ran.nextInt(1) + 9; ;
        if(factor > 6){
            return true;
        }
        return false;
    }
}
