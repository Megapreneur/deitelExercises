package PersonalTest2;

import Personal.LongestSubstring;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class LongestSubstringOfAStringTest {
    @Test
    public void testThatASubStringCanBeCreated(){
        LongestSubstring word = new LongestSubstring();
        assertNotNull(word);
    }
    @Test
    public void testThatLongestSubstringCanTakeAnInput(){
        LongestSubstring word = new LongestSubstring();
        word.collectInput("abcadeccdccd");
        assertEquals(5, word.longestSubstring());
    }
}
