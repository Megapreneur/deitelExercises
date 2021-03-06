package chapterTwo;

import java.util.Scanner;

public class NewPalindrome {
    public static void main(String... nutmeg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five digit integers: ");
        int integer = input.nextInt();

        int firstNumber = integer / 10_000;
        int secondNumber = (integer / 1_000) % 10;
        int fourthNumber = (integer % 100) / 10;
        int fifthNumber = integer % 10;

        if(firstNumber == fifthNumber)
            if(secondNumber == fourthNumber)
                System.out.printf("%d is a palindrome. ", integer);

        if(firstNumber != fifthNumber)
            if(secondNumber != fourthNumber)
                System.out.printf("%d is not a palindrome. ", integer);
    }
}