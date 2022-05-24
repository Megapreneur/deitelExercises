package ChapterFourTest;

import ChapterFour.Comparator;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class ComparatorTest {
    @Test
    public void canComparatorBeCreatedTest(){
        Comparator comparator = new Comparator();
        assertNotNull(comparator);
    }
    @Test
    public void canUserInputTwoNumberTest(){
        Comparator comparator = new Comparator();
        comparator.inputTwoNumbers(10,15);
    }
    @Test
    public void secondNumberIsGreaterTest(){
        Comparator comparator = new Comparator();
        comparator.inputTwoNumbers(10,15);
        comparator.compare();
        assertEquals(-1, comparator.getResult());
    }
    @Test
    public void firstNumberIsGreaterTest(){
        Comparator comparator = new Comparator();
        comparator.inputTwoNumbers(16,15);
        comparator.compare();
        assertEquals(1, comparator.getResult());
    }
    @Test
    public void whenBothNumbersAreEqualTest(){
        Comparator comparator = new Comparator();
        comparator.inputTwoNumbers(15,15);
        comparator.compare();
        assertEquals(0, comparator.getResult());
    }
}
