import Kaiju.Knifehead;
import Kaiju.Leatherback;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Object.Building.Building;

import static org.junit.Assert.assertEquals;

public class LeatherbackTest {

    Leatherback leatherback;
    Building building1;

    @Before
    public void before(){
        leatherback = new Leatherback("Luis","leatherback",200,30);
        building1 = new Building();
    }

    @Test
    public void canGetName(){
        assertEquals("Luis",leatherback.getName());
    }

    @Test
    public void canGetType(){
        assertEquals("leatherback",leatherback.getType());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(200,leatherback.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(30,leatherback.getAttackPower());
    }

    @Test
    public void canRoar()  {
        assertEquals("LaaLaa",leatherback.roar());
    }

    @Test
    public void canAttack()  {
        leatherback.attack(building1);
        assertEquals(140,building1.getHealthValue());
    }

    @Test
    public void canReallyJump(){
        assertEquals(true,leatherback.canJump());
    }
}
