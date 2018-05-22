import Kaiju.Knifehead;
import Object.Vehicle.NucTank;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NucTankTest {


    NucTank nucTank;
    Knifehead knifehead;

    @Before
    public void before(){
        nucTank = new NucTank("T-65",50);
        knifehead = new Knifehead("Ruri","knifehead",100,20);
    }

    @Test
    public void canGetType(){
        Assert.assertEquals("T-65",nucTank.getType());
    }

    @Test
    public void canGetHealthValue(){
        Assert.assertEquals(50,nucTank.getHealthValue());
    }


    @Test
    public void canAttack()  {
        Assert.assertEquals(200, nucTank.nucAttack());
    }

    @Test
    public void canReduceHealth() {
        nucTank.reduceHealth(20);
        Assert.assertEquals(30, nucTank.getHealthValue());
    }
}
