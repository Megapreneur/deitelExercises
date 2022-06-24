package APITest;

import API.HashMap;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertNotNull;

public class HashMapTest {
    @Test
    public void testThatHashMapCanBeCreated(){
        HashMap hashMap = new HashMap();
        assertNotNull(hashMap);
    }
}
