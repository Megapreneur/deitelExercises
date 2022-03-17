package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void setAirConditionOnTest(){
        AirConditioner flipper = new AirConditioner();
        flipper.setAirConditioner("on");
        assertEquals(true, flipper.getAirConditioner());
    }
    @Test
    public void SetAirConditionerOff(){
        AirConditioner flipper = new AirConditioner();
        flipper.setAirConditioner("off");
        assertEquals(false, flipper.getAirConditioner());
    }
    @Test
    public void decreaseTemperatureTest(){
        AirConditioner flipper = new AirConditioner();
        flipper.setTemperature(30);
        flipper.decreaseTemperature();
        assertEquals(29, flipper.getTemperature());
    }
    @Test
    public void increaseTemperatureTest(){
        AirConditioner flipper = new AirConditioner();
        flipper.setTemperature(16);
        flipper.increaseTemperature();
        assertEquals(17, flipper.getTemperature() );
    }
    @Test
    public void  decreaseTemperatureTwiceTest(){
        AirConditioner flipper = new AirConditioner();
        flipper.setTemperature(30);
        flipper.decreaseTemperature();
        flipper.decreaseTemperature();
        assertEquals(28, flipper.getTemperature());
    }
    @Test
    public void decreaseTemperatureAtLowestTemperatureTest(){
        AirConditioner flipper = new AirConditioner();
        flipper.setTemperature(16);
        flipper.decreaseTemperature();
        flipper.decreaseTemperature();
        assertEquals(16, flipper.getTemperature());
    }
    @Test
    public void increaseTemperatureAtHighestTemperatureTest(){
        AirConditioner flipper = new AirConditioner();
        flipper.setTemperature(30);
        flipper.increaseTemperature();
        flipper.increaseTemperature();
        assertEquals(30, flipper.getTemperature());
    }
}
