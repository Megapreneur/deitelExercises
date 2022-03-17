package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers{
    public static void main(String[] args){

        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = prompt.nextInt();

        System.out.println("Enter second number");
        int number2 = prompt.nextInt();

        System.out.println("Enter third number");
        int number3 = prompt.nextInt();

        System.out.println("Enter fourth number");
        int number4 = prompt.nextInt();

        System.out.println("Enter fifth number");
        int number5 = prompt.nextInt();

        int biggest = number1;
        int smallest = number1;

        if(number2 > biggest){biggest = number2;}
        if(number3 > biggest){biggest = number3;}
        if(number4 > biggest){biggest = number4;}
        if(number5 > biggest){biggest = number5;}

        if(number2 < smallest){smallest = number2;}
        if(number3 < smallest){smallest = number3;}
        if(number4 < smallest){smallest = number4;}
        if(number5 < smallest){smallest = number5;}

        System.out.printf("The biggest and smallest number is %d and %d respectively%n",biggest,smallest);

}
}
