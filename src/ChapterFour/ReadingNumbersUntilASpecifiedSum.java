package ChapterFour;

import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum {
    private static int number;
    private static int sum = 0;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        collectionOfNumbers();
        looping();
    }

    public  static int collectionOfNumbers(){

        System.out.print("Enter a number: ");
        number = input.nextInt();
        return number;
    }

    public static void looping() {


        while (number != sum | number > sum){
            System.out.print("Enter a number: ");
            int digit =input.nextInt();
            sum = sum + digit;
        }
    }
}
