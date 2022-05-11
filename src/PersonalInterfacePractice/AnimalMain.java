package PersonalInterfacePractice;

import java.util.Arrays;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Rat();
        animals[1] = new Rabbit();
        animals[2] = new Chicken();
        animals[3] = new Animal();

        System.out.println();

        for (var animal:animals) {
            animal.move();

        }
//        Animal rabbit = new Rabbit();
//        rabbit.move();
//        Chicken rabbit2 = new Chicken();
//        rabbit2.run();



    }
}
