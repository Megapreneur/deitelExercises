package ChapterSix;

import java.util.Scanner;

public class DivisibleBy5Main {
    public static void main(String[] args) {
        user();

    }
    private static void user(){
        Scanner input = new Scanner(System.in);
        DivisibleBy5 divisible = new DivisibleBy5();
        System.out.print("Numbers of digit you will like to check? ");
        int digit = input.nextInt();
        for (int i = 1; i <= digit; i++) {
            System.out.print("Enter the digit you want to check: ");
            int number = input.nextInt();
            if (divisible.isDivisible(number)) System.out.println(number + " is divisible by 5");
            else {System.out.println(number + " is not divisible by 5");}
        }
    }
}
