package APITest;

import API.Stack;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class StackTest {
    @Test
    public void testThatAStackCanBeCreated(){
        Stack stack = new Stack();
        assertNotNull(stack);
    }
    @Test
    public void testThatStackIsEmpty(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testThatWeCanPushToAStackAndCheckItNotNull(){
        Stack stack = new Stack();
        stack.push("pen");
        assertEquals(1, stack.size());
        assertFalse(stack.isEmpty());
    }
    @Test
    public void testThatWeCanPushMultipleTimesAndGetTheSizeOfTheStack(){
        Stack stack = new Stack();
        stack.push("pen");
        stack.push("biro");
        stack.push("book");
        assertEquals(3, stack.size());
    }
    @Test
    public void testThatStackHasAFixedLength(){
        Stack stack = new Stack();
        stack.push("pen");
        stack.push("biro");
        stack.push("book");
        stack.push("pencil");
        stack.push("laptop");
        stack.push("eraser");
        stack.push("notepad");
        stack.push("drawing pad");
        stack.push("snacks");
        stack.push("glasses");
        stack.push("money");
        assertEquals(5, stack.size());
    }
    @Test
    public void testThatWhenWePeekWeGetTheLastElementInTheStack(){
        Stack stack = new Stack();
        stack.push("pen");
        stack.push("biro");
        stack.push("book");
        stack.push("pencil");
        stack.push("laptop");
        stack.push("eraser");
        stack.push("notepad");
        stack.peek();
        assertEquals("laptop", stack.peek());
    }
    @Test
    public void testThatWeCanPushAndPopInTheStack(){
        Stack stack = new Stack();
        stack.push("pen");
        stack.push("biro");
        stack.push("book");
        stack.push("pencil");
        String element = stack.pop();
        assertEquals("pencil", element);
        assertEquals(3, stack.size());

    }
    @Test
    public void testForPushPopAndPeek(){
        Stack stack = new Stack();
        stack.push("pen");
        stack.push("biro");
        stack.push("book");
        stack.push("pencil");
        String element = stack.pop();
        stack.peek();
        assertEquals("pencil", element);
        assertEquals(3, stack.size());
        assertEquals("book", stack.peek());
    }
    @Test
    public void testForPushPopTwiceAndPeek(){
        Stack stack = new Stack();
        stack.push("pen");
        stack.push("biro");
        stack.push("book");
        stack.push("pencil");
        String element = stack.pop();
        stack.peek();
        assertEquals("pencil", element);
        assertEquals(3, stack.size());
        assertEquals("book", stack.peek());
        String element2 = stack.pop();
        stack.peek();
        assertEquals("book", element2);
        assertEquals(2, stack.size());
        assertEquals("biro", stack.peek());
    }


}
