import Kaiju.Knifehead;
import Object.Vehicle.Tank;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TankTest {


    Tank tank;
    Knifehead knifehead;
    @Before
    public void before(){
        tank = new Tank("Destroyers",60);
        knifehead = new Knifehead("Ruri","knifehead",100,20);
    }

    @Test
    public void canGetType(){
        Assert.assertEquals("Destroyers",tank.getType());
    }

    @Test
    public void canGetHealthValue(){
        Assert.assertEquals(60,tank.getHealthValue());
    }


    @Test
    public void canAttack()  {
        Assert.assertEquals(20,tank.cannonBallAttack());
    }

    @Test
    public void canReduceHealth() {
        tank.reduceHealth(20);
        Assert.assertEquals(40, tank.getHealthValue());
    }
}