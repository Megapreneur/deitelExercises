package Game;

public class GameBoard {
    private static char[][] gameFloor;
    public void board() {
       gameFloor = new char[][]{{' ', ' ', ' '},
                                {' ', ' ', ' '},
                                {' ', ' ', ' '}};
       printingBoard(gameFloor);
    }
    public void printingBoard(char[][] gameFloor){
        System.out.println(gameFloor[0][0] + "|" + gameFloor[0][1] + "|" + gameFloor[0][2]);
        System.out.println("-+-+-");
        System.out.println(gameFloor[1][0] + "|" + gameFloor[1][1] + "|" + gameFloor[1][2]);
        System.out.println("-+-+-");
        System.out.println(gameFloor[2][0] + "|" + gameFloor[2][1] + "|" + gameFloor[2][2]);
    }
    @Override
    public String toString(){
        StringBuilder returned = new StringBuilder();
        for (int i = 1; i < 3; i++) {
            returned.append(" | | \n");
            returned.append("-+-+-\n");
        }
        returned.append(" | | \n");
        return returned.toString();
    }
}
