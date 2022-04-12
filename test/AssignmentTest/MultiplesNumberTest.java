package AssignmentTest;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class MultiplesNumberTest {
    @Test
    public void getIntegerTest(){
        MultipleNumber multiply = new MultipleNumber();
        multiply.getIntegers(6, 2);
        assertTrue(multiply.isMultiple());
    }
    @Test
    public void falseMultipleTest(){
        MultipleNumber multiply = new MultipleNumber();
        multiply.getIntegers(13,2);
        assertFalse(multiply.isMultiple());
    }






}
