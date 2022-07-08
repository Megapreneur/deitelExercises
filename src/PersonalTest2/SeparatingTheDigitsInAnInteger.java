package PersonalTest2;

import java.util.Scanner;

public class SeparatingTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner separation = new Scanner(System.in);
        System.out.println("Enter a 5 digit number: ");
        int integer = separation.nextInt();

        int firstDigit = integer /10000;
        int secondDigit = (integer % 10000) / 1000;
        int thirdDigit = (integer % 1000) / 100;
        int fourDigit = (integer % 100) /10;
        int lastDigit = (integer % 10);

        System.out.printf("The numbers are %d %d %d %d %d%n ", firstDigit, secondDigit, thirdDigit, fourDigit, lastDigit);
    }
}
