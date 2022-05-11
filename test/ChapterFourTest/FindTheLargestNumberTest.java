package ChapterFourTest;

import ChapterFour.FindTheLargestNumber;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FindTheLargestNumberTest {
    @Test
    public void collectingNumberTest(){
        FindTheLargestNumber digit = new FindTheLargestNumber();
        digit.collectNumbers(1,2,3,4,5,6,7,8,9,10);
    }
    @Test
    public void findingTheLargestTest(){
        FindTheLargestNumber digit = new FindTheLargestNumber();
        digit.collectNumbers(1,2,3,4,5,6,7,16,9,10);
        digit.getLargestNumber();
        assertEquals(16, digit.getLargestNumber());
    }
}
