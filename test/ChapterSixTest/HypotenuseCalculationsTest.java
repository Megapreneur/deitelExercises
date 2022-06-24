package ChapterSixTest;

import ChapterSix.HypotenuseCalculations;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertNotNull;

public class HypotenuseCalculationsTest {
    @Test
    public void testThatHypotenuseCalculationAppCanBeCreated(){
        HypotenuseCalculations hypotenuse = new HypotenuseCalculations();
        assertNotNull(hypotenuse);
    }
}
