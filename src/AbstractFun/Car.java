package AbstractFun;

public abstract class Car extends Vehicle{
    @Override
    void move() {
        System.out.println("Vehicle move");
    }
    @Override
    void turnRight() {
        System.out.println("Vehicle can turn right");
    }
    abstract void turnLeft();
}
