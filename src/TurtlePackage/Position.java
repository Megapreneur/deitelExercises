package TurtlePackage;

public class Position {
    private int column;
    private int row;

    public Position(int row, int column) {
        this.column = column;
        this.row = row;

    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString(){
        return String.format("""
                row = %d
                coluwn = %d
                """, row, column);
    }
    @Override
    public boolean equals(Object o){
        Position compared = (Position) o;
        if (compared.row == row && compared.column == column){
            return true;
        }
        return false;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
