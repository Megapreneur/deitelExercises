package AbstractFun;

public class VehicleMain {
    public static void main(String[] args) {
        Motor benz = new Motor();
        benz.move();
        benz.turnLeft();
        benz.turnRight();


        Vehicle be = new Vehicle() {
            @Override
            void move() {
                System.out.println("move");
            }

            @Override
            void turnRight() {
                System.out.println("turn right");

            }

        };
        be.move();
        be.turnRight();
    }
}
