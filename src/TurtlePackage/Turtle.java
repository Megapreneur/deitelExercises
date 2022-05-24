package TurtlePackage;

import static TurtlePackage.Direction.*;

public class Turtle {
    Pen pen = new Pen();
    Direction direction = EAST;
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

    public void move(int steps) {

    }

}
