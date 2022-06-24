package ChapterThree;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter car model: ");
        String model = input.next();
        System.out.println("Enter car year: ");
        int year = input.nextInt();
        System.out.println("Enter amount of the car: ");
        double amount = input.nextDouble();
        System.out.println("enter the discount given");
        double discount = input.nextDouble();

        Car motor = new Car(model,year,amount);
        motor.setYear(year);
        motor.setModel(model);
        motor.setAmount(amount);
        motor.setDiscount(discount);
        System.out.println(motor);

    }
}
