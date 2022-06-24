package ChapterSix;

import java.util.Scanner;

public class MultipleMain {
    public static void main(String[] args) {
        user();

    }
    public static void user(){
        Multiples multiples = new Multiples();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first digit:");
        int firstDigit = input.nextInt();
        System.out.print("Enter second digit:");
        int secondDigit = input.nextInt();


        System.out.println(multiples.isMultiple(firstDigit, secondDigit));

    }
}
