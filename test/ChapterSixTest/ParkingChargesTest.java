package ChapterSixTest;

import ChapterSix.ParkingCharges;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class ParkingChargesTest {
    @Test
    public void testThatParkingChargesCanBeCreated(){
        ParkingCharges parkingCharges = new ParkingCharges();
        assertNotNull(parkingCharges);
    }
    @Test
    public void testCarPackedCanBeCharged(){
        ParkingCharges parkingCharges = new ParkingCharges();
        parkingCharges.standardCharges(2);
        assertEquals(2.0, parkingCharges.getTotalCharges());
    }
    @Test
    public void testThatCarsPackedForMoreThan3hrsWillPayMore(){
        ParkingCharges parkingCharges = new ParkingCharges();
        parkingCharges.standardCharges(5);
        assertEquals(3.0, parkingCharges.getTotalCharges());

    }
}
