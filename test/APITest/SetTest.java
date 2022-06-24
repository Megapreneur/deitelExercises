package APITest;

import API.Set;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class SetTest {
    @Test
    public void canASetBeCreatedTest(){
        Set set = new Set();
        assertNotNull(set);
    }
    @Test
    public void testThatSetIsEmpty(){
        Set set = new Set();
        assertTrue(set.isEmpty());
    }
    @Test
    public void addElementTest(){
        Set set = new Set();
        set.add(0, 40);
        assertFalse(set.isEmpty());
    }
    @Test
    public void addMultipleElementsTest(){
        Set set = new Set();
        set.add(0, 40);
        set.add(1, 45);
        set.add(2, 41);
        set.add(3, 42);
        assertEquals(4, set.size());

    }
    @Test
    public void addDuplicateElementTest(){
        Set set = new Set();
        set.add(0, 40);
        set.add(1, 45);
        set.add(2, 41);
        set.add(3, 40);
        assertEquals(3, set.size());

    }

}
