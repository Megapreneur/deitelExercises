package ChapterSixTest;

import ChapterSix.DivisibleBy5;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class DivisibleBy5Test {
    @Test
    public void testThatDivisibleBy5ApplicationCanBeCreated(){
        DivisibleBy5 divisible = new DivisibleBy5();
        assertNotNull(divisible);
    }
    @Test
    public void isDivisibleTest(){
        DivisibleBy5 divisible = new DivisibleBy5();
        boolean result = divisible.isDivisible(50);
        assertTrue(result);
    }
    @Test
    public void isNotDivisibleTest(){
        DivisibleBy5 divisible = new DivisibleBy5();
        boolean result = divisible.isDivisible(56);
        assertFalse(result);
    }
}
