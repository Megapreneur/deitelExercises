package TurtlePackageTest;


import TurtlePackage.Position;
import TurtlePackage.Sketchpad;
import TurtlePackage.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TurtlePackage.Direction.*;
import static org.testng.AssertJUnit.*;

public class TurtleTest {
    private Turtle ijapa;
    private Sketchpad sketchpad;
    @BeforeEach
    public void setUp(){
        ijapa = new Turtle();
        sketchpad = new Sketchpad(5,5);

    }

    @Test
    public void canTurtleBeCreatedTest(){
        assertNotNull(ijapa);

    }
    @Test
    public void TestThatPenIsUpByDefault(){
        ijapa.isPenDown();
        assertFalse(ijapa.isPenDown());
    }
    @Test
    public void penIsDownTest(){
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
    }
    @Test
    public void penIsUpTest(){
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        ijapa.penUp();
        assertFalse(ijapa.isPenDown());
    }
    @Test
    public void testThatTurtleFacedEastByDefault(){
        assertEquals(EAST, ijapa.getCurrentDirection());
    }
    @Test
    public void  testThatTurtleTurnsRightFromEastToSouth(){
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleTurnsRightFromSouthToWest(){
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleTurnsFromWestToNorth(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void  testThatTurtleTurnsLeftFromEastToNorth(){
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void  testThatTurtleTurnsLeftFromNorthToWest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void  testThatTurtleTurnsLeftFromWestToSouth(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    public void  testThatTurtleTurnsLeftFromSouthToEast(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanMoveForwardFromEast(){
        ijapa.move(3,sketchpad);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveDownwardTowardsSouth(){
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(3,sketchpad);
        assertEquals(new Position(2,0), ijapa.getCurrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveBackwardsTowardsWest(){
        ijapa.move(2,sketchpad);
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(4,sketchpad);
        ijapa.turnRight();
        assertEquals(new Position(3,1), ijapa.getCurrentPosition());
        ijapa.move(2,sketchpad);
        assertEquals(new Position(3,0), ijapa.getCurrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveUpwardsTowardsNorth(){
        ijapa.move(2,sketchpad);
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(4,sketchpad);
        ijapa.turnRight();
        ijapa.move(2,sketchpad);
        ijapa.turnRight();
        ijapa.move(1,sketchpad);
        assertEquals(new Position(3, 0), ijapa.getCurrentPosition());

    }
    @Test
    public void testThatPenCanWriteTowardsEast(){
        ijapa.penDown();
        ijapa.move(5,sketchpad);
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());
        String expected = """
                * * * * *\s
                         \s
                         \s
                         \s
                         \s
                """;
        assertEquals(expected,sketchpad.toString());
    }
    @Test
    public void testThatPenCanWriteTowardsSouth(){
        ijapa.penDown();
        ijapa.move(5,sketchpad);
        ijapa.turnRight();
        ijapa.move(5,sketchpad);
        assertEquals(new Position(4,4), ijapa.getCurrentPosition());
        String expected = """
                * * * * *\s
                        *\s
                        *\s
                        *\s
                        *\s
                """;
        assertEquals(expected,sketchpad.toString());
    }
    @Test
    public void testThatPenCanWriteTowardsWest(){
        ijapa.penDown();
        ijapa.move(5, sketchpad);
        ijapa.turnRight();
        ijapa.move(5,sketchpad);
        ijapa.turnRight();
        ijapa.move(5, sketchpad);
        assertEquals(new Position(4,0), ijapa.getCurrentPosition());
        String expected = """
                * * * * *\s
                        *\s
                        *\s
                        *\s
                * * * * *\s
                """;
        assertEquals(expected,sketchpad.toString());
    }
    @Test
    public void testThatPenCanWriteTowardsNorth(){
        ijapa.penDown();
        ijapa.move(5, sketchpad);
        ijapa.turnRight();
        ijapa.move(5,sketchpad);
        ijapa.turnRight();
        ijapa.move(5, sketchpad);
        ijapa.turnRight();
        ijapa.move(5, sketchpad);
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        String expected = """
                * * * * *\s
                *       *\s
                *       *\s
                *       *\s
                * * * * *\s
                """;
        assertEquals(expected,sketchpad.toString());
    }
    @Test
    public void testThatWhenPenIsUpPenCannotWrite(){
        ijapa.move(5,sketchpad);
        assertEquals(new Position(0,4), ijapa.getCurrentPosition());
        String expected = """
                         \s
                         \s
                         \s
                         \s
                         \s
                """;
        assertEquals(expected,sketchpad.toString());
    }
}
