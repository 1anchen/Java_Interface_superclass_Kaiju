package Kaiju;

public abstract class Kaiju {
    String name;
    String type;
    int healthValue;
    int attackPower;

    public Kaiju(String name, String type, int healthValue, int attackPower){
        this.name = name;
        this.type = type;
        this.healthValue = healthValue;
        this.attackPower = attackPower;
    }

    public abstract String roar();
}
