package Kaiju;

public class Knifehead extends Kaiju {

    public Knifehead(String name, String type, int healthValue, int attackPower){
        super(name,type,healthValue,attackPower);

    }

    public String roar(){
        return "KooKoo";
    }

    public int attack(int fly){
        return getAttackPower() * fly;
    }

    public int fly(){
        return 3;
    }


}
