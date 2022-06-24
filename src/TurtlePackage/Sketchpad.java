package TurtlePackage;

public class Sketchpad {
    private int[][] floor;
    public Sketchpad(int floorRow, int floorColumn) {
        floor = new int[floorRow][floorColumn];
    }
    @Override
    public String toString(){
        StringBuilder returned = new StringBuilder();
        for (int row = 0; row < floor.length; row++) {
            for (int column = 0; column < floor[row].length; column++) {
                if(floor[row][column] == 0) returned.append("  ");
                if(floor[row][column] == 1) returned.append("* ");
            }
            returned.append("\n");
        }
        return returned.toString();
    }

    public int[][] getFloor() {
        return floor;
    }
}
