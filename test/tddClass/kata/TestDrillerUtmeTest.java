package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerUtmeTest {
    @Test
    public void testDrillerTest(){
        TestDrillerUtme nutmeg = new TestDrillerUtme();
        int amount = TestDrillerUtme.testDriller(4);
        assertEquals(8000, TestDrillerUtme.getAmount());
    }
    @Test
    public void buyingMoreCopiesTest(){
        TestDrillerUtme nutmeg = new TestDrillerUtme();
        int amount = TestDrillerUtme.testDriller(6);
        assertEquals(10800, TestDrillerUtme.getAmount());
    }
    @Test
    public void buyingAbove9CopiesTest(){
        TestDrillerUtme nutmeg = new TestDrillerUtme();
        int amount = TestDrillerUtme.testDriller(20);
        assertEquals(32000, TestDrillerUtme.getAmount());
    }
    @Test
    public void buyingMoreThan29CopiesTest(){
        TestDrillerUtme nutmeg = new TestDrillerUtme();
        int amount = TestDrillerUtme.testDriller(30);
        assertEquals(45000, TestDrillerUtme.getAmount());
    }
    @Test
    public void buyingMoreThan49CopiesTest(){
        TestDrillerUtme nutmeg = new TestDrillerUtme();
        int amount = TestDrillerUtme.testDriller(60);
        assertEquals(78000, TestDrillerUtme.getAmount());
    }
    @Test
    public void buyingMoreThan99CopiesTest(){
        TestDrillerUtme nutmeg = new TestDrillerUtme();
        int amount = TestDrillerUtme.testDriller(100);
        assertEquals(120000, TestDrillerUtme.getAmount());
    }
    @Test
    public void buyingMoreThan199CopiesTest(){
        TestDrillerUtme nutmeg = new TestDrillerUtme();
        int amount = TestDrillerUtme.testDriller(400);
        assertEquals(440000, TestDrillerUtme.getAmount());
    }
    @Test
    public void  buyingMoreThan499CopiesTest(){
        TestDrillerUtme nutmeg = new TestDrillerUtme();
        int amount = TestDrillerUtme.testDriller(600);
        assertEquals(600000, TestDrillerUtme.getAmount());
    }
}
