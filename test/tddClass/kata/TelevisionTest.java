package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void turnOn(){
        Television sony = new Television();
        sony.turnOn();
        assertTrue(sony.getIsOn());
    }
    @Test
    public void turnOffTest(){
        Television sony = new Television();
        sony.turnOn();
        sony.turnOn();
        assertFalse(sony.getIsOn());
    }
    @Test
    public void increaseVolumeTest(){
        Television sony = new Television();
        sony.increaseVolume();
        assertEquals(1, sony.getVolume());
    }
    @Test
    public void increaseVolumeMultipleTimesTest(){
        Television sony = new Television();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        assertEquals(30, sony.getVolume());
    }
    @Test
    public void decreaseVolumeTest(){
        Television sony = new Television();
        sony.decreaseVolume();
        assertEquals(0,sony.getVolume());
    }
    @Test
    public void increaseAndDecreaseVolume(){
        Television sony = new Television();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.increaseVolume();
        sony.decreaseVolume();
        sony.decreaseVolume();
        sony.decreaseVolume();
        assertEquals(5, sony.getVolume());
    }
}
