package PersonalTest2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String... semicolon){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();

        System.out.print("Enter a number: ");
        int number2 = input.nextInt();

        if(number == number2){
            System.out.print("The number is a palindrome. ");

        }
        if(number != number2){
            System.out.print("The number is not a palindrome");
        }

    }
}
