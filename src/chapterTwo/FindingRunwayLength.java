package chapterTwo;

import java.util.Scanner;

public class FindingRunwayLength{
    public static void main(String[] args){

        Scanner nutmegAirline = new Scanner(System.in);
        System.out.print("Enter the speed in meter per seconds: ");
        double speed = nutmegAirline.nextDouble();

        System.out.print("Enter the acceleration in meter per second squared: ");
        double acceleration = nutmegAirline.nextDouble();

        double length = (speed * speed) / (2 * acceleration);

        System.out.printf("The minimum runway length for this airplane is %.3f%n ", length);
}
}
