package PersonalTest2;

import java.util.Scanner;

public class CalculatingTheSumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ten digit number: ");
        int number = scanner.nextInt();

        int firstNumber = number / 1000000000;
        int secondNumber = number / 100000000 % 10;
        int thirdNumber = number / 10000000 % 10;
        int fourthNumber = number / 1000000 % 10;
        int fifthNumber = number / 100000 % 10;
        int sixthNumber = number / 10000 % 10;
        int seventhNumber = number / 1000 % 10;
        int eightNumber = number / 100 % 10;
        int ninethNumber = number / 10 % 10;
        int lastNumber = number % 10;

        if(firstNumber == lastNumber && secondNumber == ninethNumber && thirdNumber == eightNumber && fourthNumber == seventhNumber && fifthNumber == sixthNumber){
            System.out.println(number+ " is a palindrome");
        }
        else{
            System.out.println(number + " is not a palindrome");
        }
        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber + seventhNumber + eightNumber + ninethNumber + lastNumber;

        int product = firstNumber * secondNumber * thirdNumber * fourthNumber * fifthNumber * sixthNumber * seventhNumber * eightNumber * ninethNumber * lastNumber;

        int average = sum / 10;


        System.out.println("The sum of the number is " + sum);
        System.out.println("The product of the number is " + product);
        System.out.println("The average of the number is " + average);



    }
}
