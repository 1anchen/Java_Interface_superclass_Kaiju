package Kaiju;

import java.util.ArrayList;
import Object.IDamage;

public abstract class Kaiju {
    protected String name;
    protected String type;
    protected int healthValue;
    protected int attackPower;
    protected ArrayList<IDamage> damagedTings;


    public Kaiju(String name, String type, int healthValue, int attackPower){
        this.name = name;
        this.type = type;
        this.healthValue = healthValue;
        this.attackPower = attackPower;
        this.damagedTings = new ArrayList<>();
    }

    public abstract String roar();
    public abstract void attack(IDamage object);


    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getHealthValue(){
        return this.healthValue;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public void addToDamagedThings(IDamage object){
        damagedTings.add(object);
    }

    public int getDamagedThings(){
        return damagedTings.size();
    }


}
