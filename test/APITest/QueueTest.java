package APITest;

import API.Queue;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class QueueTest {
    @Test
    public void canAQueueBeCreated(){
        Queue queue = new Queue();
        assertNotNull(queue);
    }
    @Test
    public void queueIsEmptyTest(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }
    @Test
    public void addAnElementInsideTheQueueTest(){
        Queue queue = new Queue();
        queue.add(234);
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
    }
    @Test
    public void weCanAddMultipleElementsInTheQueueANdPeekTest(){
        Queue queue = new Queue();
        queue.add(234);
        queue.add(2344);
        queue.add(234556);
        queue.add(234658);
        queue.add(23235434);
        queue.add(2233534);
        int element = queue.peek();
        assertEquals(6, queue.size());
        assertEquals(234, element);
    }
    @Test
    public void ourQueueHasAFixedLengthTest(){
        Queue queue = new Queue();
        queue.add(234);
        queue.add(2344);
        queue.add(234556);
        queue.add(234658);
        queue.add(23235434);
        queue.add(2233534);
        queue.add(234);
        queue.add(2344);
        queue.add(234556);
        queue.add(234658);
        queue.add(23235434);
        queue.add(2233534);
        assertEquals(10, queue.size());
    }
    @Test
    public void testThatWhenWeRemoveFromTheQueueItIsTheFirstElement(){
        Queue queue = new Queue();
        queue.add(234);
        queue.add(2344);
        queue.add(234556);
        queue.add(234658);
        queue.add(23235434);
        queue.add(2233534);
        queue.add(234);
        queue.add(2344);
        queue.add(234556);
        assertEquals(9, queue.size());
        int elements = queue.peek();
        assertEquals(234, elements);
        queue.remove();
        elements = queue.peek();
        assertEquals(2344, elements);
        assertEquals(8, queue.size());
        queue.remove();
        elements = queue.peek();
        assertEquals(234556, elements);
        assertEquals(7, queue.size());
    }

}
