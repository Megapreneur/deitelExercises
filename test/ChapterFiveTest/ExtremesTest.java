package ChapterFiveTest;

import ChapterFive.Extremes;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ExtremesTest {
    @Test
    public void getNumberTest(){
        Extremes digit = new Extremes();
        digit.getNumbers(1,2,3,4,5,6,7);
    }
    @Test
    public void getLargestNumberTest(){
        Extremes digit = new Extremes();
        digit.getNumbers(1,2,3,10,5,6,7);
        digit.getLargestNumber();
        assertEquals(10, digit.getLargestNumber());
    }
    @Test
    public void getSmallestNumberTest(){
        Extremes digit = new Extremes();
        digit.getNumbers(1,2,3,10,5,6,7);
        digit.getSmallestNumber();
        assertEquals(1, digit.getSmallestNumber());
    }
    @Test
    public void ExtremeTest(){
        Extremes digit = new Extremes();
        digit.getNumbers(1,2,3,10,5,6,7);
        digit.getLargestNumber();
        digit.getSmallestNumber();
        digit.extreme();
        assertEquals(1, digit.getSmallestNumber());
        assertEquals(11, digit.extreme());

    }


}
