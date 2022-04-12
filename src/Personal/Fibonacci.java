package Personal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int a = 0, b = 1, c = 0;
        System.out.print(a+" "+b);

        for(int i = 2; i < number; i++){
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }

    }
}
