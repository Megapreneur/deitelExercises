package ChapterThreeTest;

import ChapterThree.Clock;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class ClockTest {
    @Test
    public void isClockTest(){
        Clock clock = new Clock(6, 30,50);
        assertNotNull(clock);
    }
    @Test
    public void clockSecondsTest(){
        Clock clock = new Clock(6,30,50);
        clock.setSeconds(60);
        assertEquals(0, clock.getSeconds());
    }
    @Test
    public void clockMinutesTest(){
        Clock clock = new Clock(6,30, 50);
        clock.setSeconds(40);
        clock.setMinutes(60);
        assertEquals(40, clock.getSeconds());
        assertEquals(0, clock.getMinutes());
    }
    @Test
    public void clockHoursTest(){
        Clock clock = new Clock(6, 50, 30);
        clock.setSeconds(40);
        clock.setMinutes(50);
        clock.setHours(24);
        assertEquals(40, clock.getSeconds());
        assertEquals(50, clock.getMinutes());
        assertEquals(0, clock.getHours());
    }
    @Test
    public void displayTimeTest(){
        Clock clock = new Clock(6, 50, 30);
        clock.setSeconds(20);
        clock.setMinutes(10);
        clock.setHours(2);
       assertEquals(20, clock.getSeconds());
        assertEquals(10, clock.getMinutes());
        assertEquals(2, clock.getHours());
        assertEquals("2:10:20",clock.getDisplayTime());
    }
}
