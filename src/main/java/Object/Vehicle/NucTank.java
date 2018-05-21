package Vehicle;

public class NucTank extends Vehicle implements IDamage {

    public NucTank(String type, int healthValue){
        super(type, healthValue);
    }

    public int nucAttack(){
        return  200;
    }

    public int reduceHealth(){

    }
}
