package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaticBikeTest {
    @Test
    public void setBikeOnTest(){
        AutomaticBike qLink = new AutomaticBike();
        qLink.setBike("on");
        assertEquals(true, qLink.getBike());
    }
    @Test
    public void setBikeOffTest(){
        AutomaticBike qLink = new AutomaticBike();
        qLink.setBike("off");
        assertEquals(false, qLink.getBike());
    }
    @Test
    public void bikeAccelerationOneTest(){
        AutomaticBike qLink = new AutomaticBike();
        qLink.acceleration(0);
        assertEquals(1, qLink.getAcceleration());
    }
}
