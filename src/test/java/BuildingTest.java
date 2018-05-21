import Object.Building.Building;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Kaiju.*;

public class BuildingTest {


   Building building1;
   Building building2;
   Building building3;
   Knifehead knifehead;

    @Before
    public void before(){
        building1 = new Building();
        building2 = new Building();
        building3 = new Building();
        knifehead = new Knifehead("Ruri","knifehead",100,20);

    }

    @Test
    public void canGetType(){
        Assert.assertEquals(200,building1.getHealthValue());
    }

    @Test
    public void canReduceHealth() {
        building1.reduceHealth(knifehead);
        Assert.assertEquals(180, building1.getHealthValue());
    }


}