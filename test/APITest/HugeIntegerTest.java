package APITest;

import API.HugeInteger;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class HugeIntegerTest {
    @Test
    public void testThatHugeIntegerCanBeCreated(){
        HugeInteger hugeInteger = new HugeInteger();
        assertNotNull(hugeInteger);
    }
    @Test
    public void testThatHugeIntegerCanParse(){
        HugeInteger hugeInteger = new HugeInteger();
        hugeInteger.parse("9876556789432112345987651234524680135795");
        int[] number = hugeInteger.getArrayElement();
        assertEquals(9, number[0]);
        assertEquals(3, number[11]);
        assertEquals(6, number[31]);
        assertEquals(1, number[13]);
    }
    @Test
    public void testThatHugeIntegerCanBeConvertedIntoString(){
        HugeInteger hugeInteger = new HugeInteger();
        hugeInteger.parse("9876556789432112345987651234524680135795");
        int[] number = hugeInteger.getArrayElement();
        assertEquals(5, number[5]);
        assertEquals(4, number[10]);
        assertEquals(8, number[20]);
        assertEquals("9876556789432112345987651234524680135795", hugeInteger.toString());
    }
}
