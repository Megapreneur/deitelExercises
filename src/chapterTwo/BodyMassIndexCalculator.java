package chapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String... nutmeg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        if(bmi <= 18.5)
        System.out.printf(" You are underweight, your bmi value is %.2f%n", bmi);

        if(bmi >= 18.5 && bmi <= 24.9)
            System.out.printf(" You are normal weight, your bmi value is %.2f%n", bmi);

        if(bmi >= 25 && bmi <= 29.9 )
            System.out.printf(" You are overweight, your bmi value is %.2f%n", bmi);

        if(bmi >= 30)
            System.out.printf(" You are obese, your bmi value is %.2f%n", bmi);
    }
}
