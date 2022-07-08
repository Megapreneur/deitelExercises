package PersonalTest2;

import java.util.Scanner;

public class multiplicationTable {
    static Scanner input = new Scanner(System.in);
    private static int number;

    public static void main(String[] args) {
        obtainingANumber();
        condition();

    }
    public static void obtainingANumber(){
        System.out.print("Enter a number: ");
        number = input.nextInt();
    }
    public static void printingMultiplication(){
        int answer = 0;
        for (int i = 1; i < 13; i++) {
            answer = number * i;
            System.out.println(number+" * " +i + " = " +answer);
        }
    }
    public static void printingWithWhileLoop(){
        int sum = 0;
        int i = 1;
        while (i < 13){
            sum = number * i;
            System.out.println(number+ " * " +i + " = " + sum);
            i++;
        }
    }
    public static void condition(){
        if(number > 2){
            printingWithWhileLoop();
        }
        else
            System.out.println("Number should be greater than 2");

    }

}

