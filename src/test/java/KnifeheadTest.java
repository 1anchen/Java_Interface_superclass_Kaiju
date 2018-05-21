import Kaiju.Knifehead;
import Object.Building.Building;
import Object.Vehicle.NucTank;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnifeheadTest
{

    Knifehead knifehead;
    Building building1;
    NucTank nucTank;
    @Before
    public void before(){
        knifehead = new Knifehead("Ruri","knifehead",100,20);
        building1 = new Building();
        nucTank = new NucTank("T-65",50);
    }

    @Test
    public void canGetName(){
        assertEquals("Ruri",knifehead.getName());
    }

    @Test
    public void canGetType(){
        assertEquals("knifehead",knifehead.getType());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(100,knifehead.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(20,knifehead.getAttackPower());
    }

    @Test
    public void canRoar()  {
        assertEquals("KooKoo",knifehead.roar());
    }

    @Test
    public void canAttack()  {
        assertEquals(60,knifehead.attack(knifehead.fly()));
    }

    @Test
    public void canGetDamagedThings(){
       assertEquals(0, knifehead.getDamagedThings());
    }

    @Test
    public void canGetOneDamagedThings(){
        knifehead.addToDamagedThings(building1);
        assertEquals(1, knifehead.getDamagedThings());
    }


    @Test
    public void canGetTwoDamagedThings(){
        knifehead.addToDamagedThings(building1);
        knifehead.addToDamagedThings(nucTank);
        assertEquals(2, knifehead.getDamagedThings());
    }


}
