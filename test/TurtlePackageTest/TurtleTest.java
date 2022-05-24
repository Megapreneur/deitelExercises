package TurtlePackageTest;

import TurtlePackage.Direction;
import TurtlePackage.Turtle;
import org.junit.jupiter.api.Test;

import static TurtlePackage.Direction.*;
import static org.testng.AssertJUnit.*;

public class TurtleTest {
    @Test
    public void canTurtleBeCreatedTest(){
        Turtle ijapa = new Turtle();
    }
    @Test
    public void TestThatPenIsUpByDefault(){
        Turtle ijapa = new Turtle();
        ijapa.isPenDown();
        assertFalse(ijapa.isPenDown());
    }
    @Test
    public void penIsDownTest(){
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
    }
    @Test
    public void penIsUpTest(){
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        ijapa.penUp();
        assertFalse(ijapa.isPenDown());
    }
    @Test
    public void testThatTurtleFacedEastByDefault(){
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        assertEquals(EAST, ijapa.getCurrentDirection());
    }
    @Test
    public void  testThatTurtleTurnsRightFromEastToSouth(){
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleTurnsRightFromSouthToWest(){
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleTurnsFromWestToNorth(){
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanMoveForward(){
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        ijapa.turnRight();
        ijapa.move(4);
        assertEquals(4, ijapa.getCurrentPosition());

    }

}
