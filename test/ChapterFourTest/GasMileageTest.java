package ChapterFourTest;

import ChapterFour.GasMileage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class GasMileageTest {
    GasMileage car;
    @BeforeEach
    public void setUp(){
        car = new GasMileage();
    }
    @Test
    public void carCanBeDrivenTest(){
        assertNotNull(car);
    }
    @Test
    public void driveForSomeMiles(){
        car.miles(100);
        assertEquals(100, car.getMiles());
    }
    @Test
    public void gallonsUsedForDrivingTest(){
        car.miles(100);
        assertEquals(100, car.getMiles());
        car.gallons(50);
        assertEquals(50, car.getGallons());
    }
    @Test
    public void milesPerGallonTest(){
        car.miles(100);
        assertEquals(100, car.getMiles());
        car.gallons(50);
        assertEquals(50, car.getGallons());
        assertEquals(2.0, car.getMilePerGallon());
    }
}
