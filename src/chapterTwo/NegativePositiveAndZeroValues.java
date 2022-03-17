package chapterTwo;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String... nutmeg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int firstNumber = input.nextInt();
        if(firstNumber < 0)System.out.printf("%d is a negative integer value %n", firstNumber);
        if(firstNumber == 0)System.out.printf("%d is a zero integer value %n", firstNumber);
        if (firstNumber >= 0)System.out.printf("%d is a positive integer value %n", firstNumber);

        System.out.print("Enter a number: ");
        int secondNumber = input.nextInt();
        if(secondNumber < 0)System.out.printf("%d is a negative integer value %n", secondNumber);
        if(secondNumber == 0)System.out.printf("%d is a zero integer value %n", secondNumber);
        if (secondNumber >= 0)System.out.printf("%d is a positive integer value %n", secondNumber);

        System.out.print("Enter a number: ");
        int thirdNumber = input.nextInt();
        if(thirdNumber < 0)System.out.printf("%d is a negative integer value %n", thirdNumber);
        if(thirdNumber == 0)System.out.printf("%d is a zero integer value %n", thirdNumber);
        if (thirdNumber >= 0)System.out.printf("%d is a positive integer value %n", thirdNumber);

        System.out.print("Enter a number: ");
        int fourthNumber = input.nextInt();
        if(fourthNumber < 0)System.out.printf("%d is a negative integer value %n", fourthNumber);
        if(fourthNumber == 0)System.out.printf("%d is a zero integer value %n", fourthNumber);
        if (fourthNumber >= 0)System.out.printf("%d is a positive integer value %n", fourthNumber);

        System.out.print("Enter a number: ");
        int fifthNumber = input.nextInt();
        if(fifthNumber < 0)System.out.printf("%d is a negative integer value %n", fifthNumber);
        if(fifthNumber == 0)System.out.printf("%d is a zero integer value %n", fifthNumber);
        if (fifthNumber >= 0)System.out.printf("%d is a positive integer value %n", fifthNumber);
    }
}
