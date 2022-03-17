package chapterTwo;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
    public static void main(String... asher){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        double pie = Math.PI;

        int diameter = 2 * radius;
        double circumference = 2 * pie * radius;
        double area = pie * radius * radius;

        System.out.printf("The diameter, circumference  and area of the circle are %d, %.2f and %.2f respectively. ", diameter, circumference, area);

    }


}
