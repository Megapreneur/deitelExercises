package ChapterFiveTest;

import ChapterFive.IntegersDivisibleBy3;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class IntegersDivisibleBy3Test {
    @Test
    public void numberTest(){
        IntegersDivisibleBy3 number = new IntegersDivisibleBy3();
        number.collectNumber(30);
        assertEquals(165, number.getResult());

    }
}
