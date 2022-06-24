package GameTest;

import Game.GameBoard;
import Game.Player;
import Game.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;


public class TicTacToeTest {
    private TicTacToe ticTacToe;
    private GameBoard gameBoard;
    @BeforeEach
    public void setUp(){
        ticTacToe = new TicTacToe();
        gameBoard = new GameBoard();
    }
    @Test
    public void testThatTicTacToeCanBeCreated(){
        assertNotNull(ticTacToe);
    }
    @Test
    public void testThatTicTacToeHasABoard(){
        ticTacToe.gameBoard();

    }
    @Test
    public void testThatPlayerCanBeCreated(){
        ticTacToe.gameBoard();
        ticTacToe.Player("Ademola");
        assertEquals("Ademola", ticTacToe.getPlayer());
    }
    @Test
    public void testThatPlayerCanPlayTicTacToe(){
//        ticTacToe.gameBoard();
        ticTacToe.Player("Ademola");
        ticTacToe.play("Ademola", 2);
        String expected = """
                 | |\s
                -+-+-
                 | |\s
                -+-+-
                 | |\s
                """;
        assertEquals(expected, gameBoard.toString());
    }


}
