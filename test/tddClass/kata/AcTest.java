package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcTest {
    @Test
    public void turnOnTest(){
        Ac samsung = new Ac();
        samsung.isOn(true);
        assertEquals(true, samsung.getOn());
    }
    @Test
    public void turnOffTest(){
        Ac samsung = new Ac();
        samsung.isOn(false);
        assertEquals(false, samsung.getOn());
    }
    @Test
    public void setTemperatureTest(){
        Ac samsung = new Ac();
        samsung.setTemperature(16);
        assertEquals(16, samsung.getTemperature());
    }
    @Test
    public void increaseTemperatureTest(){
        Ac samsung = new Ac();
        samsung.setTemperature(16);
        samsung.increaseTemperature();
        assertEquals(17, samsung.getTemperature());
    }
    @Test
    public void multipleTemperatureIncreaseTest(){
        Ac samsung = new Ac();
        samsung.setTemperature(16);
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        samsung.increaseTemperature();
        assertEquals(29, samsung.getTemperature());
    }
    @Test
    public void decreaseTemperature(){
        Ac samsung = new Ac();
        samsung.setTemperature(30);
        samsung.decreaseTemperature();
        assertEquals(29, samsung.getTemperature());
    }
    @Test
    public void multipleTemperature(){
        Ac samsung = new Ac();
        samsung.setTemperature(24);
        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        samsung.decreaseTemperature();
        assertEquals(17, samsung.getTemperature());
    }
}
