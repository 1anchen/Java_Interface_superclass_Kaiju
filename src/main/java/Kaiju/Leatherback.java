package Kaiju;

public class Leatherback extends Kaiju{

    public Leatherback(String name, String type, int healthValue, int attackPower){
        super(name,type,healthValue,attackPower);

    }

    public String roar() {
        return "LaaLaa";
    }

    public int attack(int jump){
        return getAttackPower() * jump;
    }

    public int jump(){
        return 2;
    }
}
