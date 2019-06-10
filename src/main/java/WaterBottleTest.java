import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void waterBottleHasAVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void takingADrinkReducesVolumeBy10(){
        assertEquals(90, waterBottle.takeDrink());
    }

    @Test
    public void emptyWaterBottle(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fillWaterBottleToFull(){
        assertEquals(100, waterBottle.fill());
    }
}
