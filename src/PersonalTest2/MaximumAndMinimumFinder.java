package PersonalTest2;

import java.util.Scanner;

public class MaximumAndMinimumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating_point values separated by spaces: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        System.out.print("Enter three integer values separated by spaces: ");
        int firstnumber = input.nextInt();
        int secondNumber = input.nextInt();

        int thirdNumber = input.nextInt();

        double result = maximum(number1, number2, number3);
        int resultMinimum = minimum(firstnumber, secondNumber, thirdNumber);

        System.out.println("Maximum is " + result);
        System.out.println("Minimum is " + resultMinimum);
    }
    public static  double maximum(double x, double y, double z){
        double maximumValue = x;
        if (y > maximumValue){
            maximumValue = y;
        }
        if(z > maximumValue){
            maximumValue = z;
        }
        return maximumValue;
    }
    private  static int minimum(int x, int y, int z){
        int miniumValue = x;
        if(y < miniumValue){
            miniumValue = y;
        }
        if(z < miniumValue){
            miniumValue = z;
        }
        return miniumValue;
    }
}
