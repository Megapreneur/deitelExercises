package ChapterSixTest;

import ChapterSix.LeapYear;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class LeapYearTest {
    @Test
    public void TestLeapYear(){
        LeapYear myYear = new LeapYear();
        myYear.setYear(2200);
        assertFalse(myYear.isLeapYear(2200));
    }
    @Test
    public void isLeapYearTest(){
        LeapYear myYear = new LeapYear();
        myYear.setYear(2024);
        assertTrue(myYear.isLeapYear(2024));

    }
}
