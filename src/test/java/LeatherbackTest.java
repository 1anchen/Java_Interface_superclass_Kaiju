import Kaiju.Knifehead;
import Kaiju.Leatherback;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeatherbackTest {

    Leatherback leatherback;

    @Before
    public void before(){
        leatherback = new Leatherback("Luis","leatherback",200,30);

    }

    @Test
    public void canGetName(){
        Assert.assertEquals("Luis",leatherback.getName());
    }

    @Test
    public void canGetType(){
        Assert.assertEquals("leatherback",leatherback.getType());
    }

    @Test
    public void canGetHealthValue(){
        Assert.assertEquals(200,leatherback.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        Assert.assertEquals(30,leatherback.getAttackPower());
    }

    @Test
    public void canRoar()  {
        Assert.assertEquals("LaaLaa",leatherback.roar());
    }

    @Test
    public void canAttack()  {
        Assert.assertEquals(60,leatherback.attack(leatherback.jump()));
    }
}
