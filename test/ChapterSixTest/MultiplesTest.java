package ChapterSixTest;

import ChapterSix.Multiples;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class MultiplesTest {
    @Test
    public void testThatMultipleApplicationCanBeCreated(){
        Multiples multiples = new Multiples();
        assertNotNull(multiples);
    }
    @Test
    public void isMultipleTest(){
        Multiples multiples = new Multiples();
        boolean result = multiples.isMultiple(9,3);
        assertTrue(result);
    }
    @Test
    public void isNotMultipleTest(){
        Multiples multiples = new Multiples();
        boolean result = multiples.isMultiple(9,2);
        assertFalse(result);
    }
}
