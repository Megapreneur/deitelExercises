package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoBikeTest {
    @Test
    public void turnOnTest(){
        AutoBike suzuki = new AutoBike();
        assertFalse(suzuki.getOn());
        suzuki.isOn();
        assertTrue(suzuki.getOn());
    }
    @Test
    public void turnOffTest(){
        AutoBike suzuki = new AutoBike();
        suzuki.isOn();
        assertTrue(suzuki.getOn());
        suzuki.isOn();
        assertFalse(suzuki.getOn());
    }
    @Test
    public void accelerationTest(){
        AutoBike suzuki = new AutoBike();
        suzuki.isOn();
        suzuki.acceleration();
        assertEquals(1, suzuki.getSpeed());
    }
    @Test
    public void multipleAccelerationTest() {
        AutoBike suzuki = new AutoBike();
        suzuki.isOn();
        int acceleration = 0;
        while (acceleration < 22){
            suzuki.acceleration();
            acceleration++;
        }


        assertEquals(24, suzuki.getSpeed());
    }
    @Test
    public void deceleration(){
        AutoBike suzuki = new AutoBike();
        suzuki.deceleration();
        suzuki.deceleration();
        assertEquals(0, suzuki.getSpeed());
    }
    @Test
    public void accelerationAndDeceleration(){
        AutoBike suzuki = new AutoBike();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.acceleration();
        suzuki.deceleration();
        suzuki.deceleration();
        assertEquals(38, suzuki.getSpeed());
    }

}
