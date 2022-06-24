package APITest;

import API.LinkedList;
import API.Node;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class LinkedListTest {
    @Test
    public void testThatLinkedListCanBeCreated(){
        LinkedList linkedList = new LinkedList();
        assertNotNull(linkedList);
    }
    @Test
    public void testThatLinkedListIsEmpty(){
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());
    }
    @Test
    public void TestThatLinkedListUsesANode(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(14);
        int size = linkedList.getSize();
        assertEquals(1, size);
        assertFalse(linkedList.isEmpty());
    }
    @Test
    public void testThatWeCanAddMultipleDataToTheLinkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(14);
        linkedList.addFirst(34);
        linkedList.addFirst(340);
        int size = linkedList.getSize();
        assertEquals(3, size);
    }
    @Test
    public void testThatWeCanPeekAndGetTheFirstData(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(14);
        linkedList.addFirst(34);
        linkedList.addFirst(340);
        Node data = linkedList.peek();
        assertSame(340, data);
    }
    @Test
    public void testThatWeCanDeleteFromTheFront(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(14);
        linkedList.addFirst(34);
        linkedList.addFirst(340);
        linkedList.deleteFirst();
        assertEquals(2, linkedList.getSize());
    }
    @Test
    public void testThatWeCanDeleteTheLastData(){
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(14);
        linkedList.addFirst(34);
        linkedList.addFirst(340);
        linkedList.deleteLast();
        assertEquals(2, linkedList.getSize());


    }
}
