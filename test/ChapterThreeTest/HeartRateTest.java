package ChapterThreeTest;

import ChapterThree.HeartRate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HeartRateTest {
    HeartRate heartRate;
    @BeforeEach
    public void setUp(){
        heartRate = new HeartRate("ade","shola", 12,5,2022);
    }

    @Test
    public void isHeartRate(){
        heartRate.setDay(24);
        heartRate.setMonth(12);
        heartRate.setYearOfBirth(2013);
        assertEquals(24, heartRate.getDay());
        assertEquals(12, heartRate.getMonth());
        assertEquals(2013, heartRate.getYearOfBirth());
        heartRate.setName("bola", "peace");
        assertEquals("bola peace", heartRate.getName());

    }
    @Test
    public void testForAge(){
        heartRate.setDay(24);
        heartRate.setMonth(12);
        heartRate.setYearOfBirth(2011);
        heartRate.calculateAge(2022);
        assertEquals(24, heartRate.getDay());
        assertEquals(12, heartRate.getMonth());
        assertEquals(2011, heartRate.getYearOfBirth());
        heartRate.setName("bola", "peace");
        assertEquals("bola peace", heartRate.getName());
        assertEquals(11, heartRate.calculateAge(2022));
    }
    @Test
    public void maximumHeartRateTest(){
        heartRate.setDay(24);
        heartRate.setMonth(12);
        heartRate.setYearOfBirth(2011);
        heartRate.calculateAge(2022);
        heartRate.maximumHeartRate();
        assertEquals(24, heartRate.getDay());
        assertEquals(12, heartRate.getMonth());
        assertEquals(2011, heartRate.getYearOfBirth());
        heartRate.setName("bola", "peace");
        assertEquals("bola peace", heartRate.getName());
        assertEquals(11, heartRate.calculateAge(2022));
        assertEquals(209, heartRate.maximumHeartRate());
    }
    @Test
    public void targetHeartRate(){
        heartRate.setDay(24);
        heartRate.setMonth(12);
        heartRate.setYearOfBirth(2011);
        heartRate.calculateAge(2022);
        heartRate.maximumHeartRate();
        heartRate.targetHeartRate(50);
        assertEquals(24, heartRate.getDay());
        assertEquals(12, heartRate.getMonth());
        assertEquals(2011, heartRate.getYearOfBirth());
        heartRate.setName("bola", "peace");
        assertEquals("bola peace", heartRate.getName());
        assertEquals(11, heartRate.calculateAge(2022));
        assertEquals(209, heartRate.maximumHeartRate());
        assertEquals(104.5, heartRate.targetHeartRate(50));
    }

}
