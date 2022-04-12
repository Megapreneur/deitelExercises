package Personal;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int product = 1, i = 1;

        while(i <= number){
             product *= i;
             i++;
        }
        System.out.println(product);
    }
}
