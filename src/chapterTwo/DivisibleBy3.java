package chapterTwo;

import java.util.Scanner;

public class DivisibleBy3{
    public static void main(String[] args){

    Scanner prompt = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = prompt.nextInt();
    
    int division = number % 3;

    if (division == 0){
        System.out.println("The number is divisible by 3 ");
    }
    if (division != 0){
        System.out.println("The number is not divisible by 3");
    }
    
        



}
}
