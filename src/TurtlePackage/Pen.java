package TurtlePackage;

public class Pen {
    boolean isPenIsDown = false;

public void penDown(){
    isPenIsDown = true;
}
public boolean penPosition(){
    return isPenIsDown;
}

    public void penUp() {
    isPenIsDown = false;
    }
}
