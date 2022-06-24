package TurtlePackage;


import static TurtlePackage.Direction.*;

public class Turtle {
    Pen pen = new Pen();
    Direction direction = EAST;
    private Position position = new Position(0,0);

    public boolean isPenDown() {
        return pen.penPosition();
    }

    public void penDown() {
        pen.penDown();
    }

    public void penUp() {
        pen.penUp();
    }
    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        switch (direction){
            case EAST -> face(SOUTH);
            case WEST -> face(NORTH);
            case SOUTH -> face(WEST);
            case NORTH -> face(EAST);
        }
    }
    public void face(Direction currentDirection){
        direction = currentDirection;
    }
    public void turnLeft() {
        switch (direction){
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case SOUTH -> face(EAST);
            case WEST -> face(SOUTH);
        }
    }

    public void move(int noOfSteps, Sketchpad sketchpad) {
        if(isPenDown()){
            if(direction == EAST){writeOnAcrossColumnBy(noOfSteps, sketchpad);}
            if(direction == SOUTH){writeOnAcrossRowBy(noOfSteps, sketchpad);}
            if (direction == WEST){writeBackwardAcrossColumnBy(noOfSteps, sketchpad);}
            if (direction == NORTH){writeBackwardAcrossRowBy(noOfSteps, sketchpad);}
        }



        if(direction == EAST){increaseColumnBy(noOfSteps);}
        if (direction == SOUTH){increaseRowBy(noOfSteps);}
        if(direction == WEST){decreaseColumnBy(noOfSteps);}
        if (direction == NORTH){decreaseRowBy(noOfSteps);}
    }

    private void writeBackwardAcrossRowBy(int noOfSteps, Sketchpad sketchpad) {
        int [][] floor = sketchpad.getFloor();
        int row = position.getRow();
        int column = position.getColumn();
        noOfSteps = row - noOfSteps;
        for (int i = row; i > noOfSteps ; i--) {
            floor[i][column] = 1;
        }
    }

    private void writeBackwardAcrossColumnBy(int noOfSteps, Sketchpad sketchpad) {
        int[][] floor = sketchpad.getFloor();
        int row = position.getRow();
        int column = position.getColumn();
        noOfSteps = column - noOfSteps;
        for (int i = column; i > noOfSteps ; i--) {
            floor[row][i] = 1;

        }

    }

    private void writeOnAcrossRowBy(int noOfSteps, Sketchpad sketchpad) {
        int[][] floor = sketchpad.getFloor();
        int row = position.getRow();
        int column = position.getColumn();
        noOfSteps = noOfSteps + row;
        for (int i = row; i < noOfSteps; i++) {
            floor[i][column] = 1;
        }
    }

    private void writeOnAcrossColumnBy(int noOfSteps, Sketchpad sketchpad) {
        int[][] floor = sketchpad.getFloor();
        int row = position.getRow();
        int column = position.getColumn();
        noOfSteps = noOfSteps + column;
        for (int i = column; i < noOfSteps; i++) {
            floor[row][i] = 1;
        }
    }

    private void decreaseRowBy(int noOfSteps) {
        int currentRowPosition = position.getRow();
        position.setRow(currentRowPosition - (noOfSteps - 1));
    }

    private void decreaseColumnBy(int noOfSteps) {
        int currentColumnPosition = position.getColumn();
        position.setColumn(currentColumnPosition - (noOfSteps - 1));
    }

    private void increaseRowBy(int noOfSteps) {
        int currentRowPosition = position.getRow();
        position.setRow(currentRowPosition + noOfSteps -1);
    }



    private void increaseColumnBy(int noOfSteps) {
        int currentColumnPosition = position.getColumn();
        position.setColumn(currentColumnPosition + noOfSteps - 1);

    }


    public Position getCurrentPosition() {
        return position;
    }


}
