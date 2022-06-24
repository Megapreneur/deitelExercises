package APITest;

import API.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class ArrayListImplementionTest {
    private ArrayList arrayList;
    @BeforeEach
    public void setUp(){
        arrayList = new ArrayList();
    }
    @Test
    public void canAnArrayListBeCreated(){
        assertNotNull(arrayList);
    }
    @Test
    public void arrayListIsEmptyTest(){
        assertTrue(arrayList.isEmpty());
    }
    @Test
    public void addAnElementIntoTheArrayListTest(){
        arrayList.add(0, 256);
        assertFalse(arrayList.isEmpty());
    }
    @Test
    public void addMultipleElementIntoTheArrayListTest(){
        arrayList.add(0, 256);
        arrayList.add(1, 254);
        arrayList.add(2, 258);
        arrayList.add(3, 259);
        arrayList.add(4, 250);
        int number = arrayList.getSize();
        assertEquals(5, number);
    }

    @Test
    public void addAnElementToTheArrayListAndGetTheElementBackTest(){
        arrayList.add(0, 234);
        Object element = arrayList.get(0);
        assertEquals(234,element);
    }
    @Test
    public void replaceAndElementIntoTheArrayListTest(){
        arrayList.add(0, 256);
        arrayList.add(1, 254);
        arrayList.add(2, 258);
        arrayList.add(3, 259);
        arrayList.add(4, 250);
        arrayList.set(3, 300);
        Object newElement = arrayList.get(3);
        assertEquals(300, newElement);
    }
    @Test
    public void removeAndElementFromTheArrayListTest(){
        arrayList.add(0, 256);
        arrayList.add(1, 666);
        arrayList.add(2, 258);
        arrayList.add(3, 259);
        arrayList.add(4, 250);
        arrayList.remove(3);
        int numberOfElement = arrayList.getSize();
        assertEquals(4, numberOfElement);
        Object element = arrayList.get(3);
        assertEquals(0, element);
        Object element2 = arrayList.get(4);
        assertEquals(250, element2);
    }
    @Test
    public void clearAllElementsInTheArrayList(){
        arrayList.add(0, 256);
        arrayList.add(1, 254);
        arrayList.add(2, 258);
        arrayList.add(3, 259);
        arrayList.add(4, 250);
        arrayList.clear();
        assertEquals(0, arrayList.getSize());
        assertEquals(0, arrayList.get(2));
    }
    @Test
    public void arrayListCanExtendBySizeTest(){
        arrayList.add(0, 256);
        arrayList.add(1, 254);
        arrayList.add(2, 258);
        arrayList.add(3, 259);
        arrayList.add(4, 250);
        arrayList.add(5, 236);
        arrayList.add(6, 234);
        arrayList.add(7, 238);
        arrayList.add(8, 239);
        arrayList.add(9, 220);
        arrayList.add(10, 210);
        assertEquals(11, arrayList.getSize());
        assertEquals(250, arrayList.get(4));

    }
}
