package ChapterSix;

import java.util.Scanner;

public class TemperatureConversionsMain {
    static TemperatureConversions temperature = new TemperatureConversions();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        solveKelvin();
        solveCelsius();

    }
    public static void solveKelvin(){
        System.out.println("Enter the temperature in celsius: ");
        double celsius = input.nextDouble();
        temperature.calculateKelvin(celsius);
        System.out.println(temperature.getKelvin());
    }
    public static void solveCelsius(){
        System.out.println("Enter the temperature in kelvin: ");
        double kelvin = input.nextDouble();
        temperature.calculateCelsius(kelvin);
        System.out.println(temperature.getCelsius());
    }

}
