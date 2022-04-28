package ChapterFiveTest;

import ChapterFive.TheSumAndProductOfASeries;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TheSumAndProductOfASeriesTest {
    @Test
    public void isNumberTest(){
        TheSumAndProductOfASeries number = new TheSumAndProductOfASeries();
        number.setNumber(1,100);
        assertEquals(100, number.getNumber());
    }
    @Test
    public void sumOfSeries(){
        TheSumAndProductOfASeries number = new TheSumAndProductOfASeries();
        number.setNumber(1,100);
        number.series();
        assertEquals(100, number.getNumber());
        assertEquals(5050, number.getSumOfSeries());
    }
    @Test
    public void productOfSeries(){
            TheSumAndProductOfASeries number = new TheSumAndProductOfASeries();
            number.setNumber(1,5);
            number.series();
           // assertEquals(100, number.getNumber());
            assertEquals(15, number.getSumOfSeries());
            assertEquals(120, number.getProductOfSeries());

    }
}
