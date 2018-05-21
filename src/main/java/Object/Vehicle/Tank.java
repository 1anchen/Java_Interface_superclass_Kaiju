package Vehicle;

public class Tank extends Vehicle {

    public Tank(String type, int healthValue){
        super(type, healthValue);
    }

    public int cannonBallAttack(){
        return  20;
    }
}
