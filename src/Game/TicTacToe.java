package Game;

public class TicTacToe {
    GameBoard gameBoard = new GameBoard();
    Player player = new Player();
    public void gameBoard() {
        gameBoard.board();
    }
    public void Player(String name) {
        player.setPlayer(name);
    }
    public String getPlayer() {
        return player.getPlayer();
    }

    public void play(String name, int move) {
    }
}
