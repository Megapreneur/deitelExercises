package chapterTwo;

import java.util.Scanner;

public class Multiples {

    public static void main(String... java){
        Scanner prompt = new Scanner(System.in);
        System.out.print("Enter first integer ");
        int number1 = prompt.nextInt();

        System.out.print("Enter second integer ");
        int number2 = prompt.nextInt();
        int firstNumberTripled = number1 * number1 * number1;
        int secondNumberDoubled = number2 * number2;

        int multiple = firstNumberTripled % secondNumberDoubled;

        if(multiple == 0){
            System.out.printf("%d is a multiple of %d. ", firstNumberTripled, secondNumberDoubled);
        }
        if(multiple != 0){
            System.out.printf("%d is not a multiple of %d. ", firstNumberTripled, secondNumberDoubled);
        }

    }
}
