package chapterTwo;

import java.util.Scanner;

public class CompoundValue{
    public static void main(String... Nutmeg){

        Scanner meg = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double amount = meg.nextDouble();

        double firstMonth = amount * (1 + 0.00417);
        double secondMonth = (100 + firstMonth) * (1 + 0.00417);
        double thirdMonth = (100 + secondMonth) * (1 + 0.00417);
        double fourthMonth = (100 + thirdMonth) * (1 + 0.00417);
        double fifthMonth = (100 + fourthMonth) * (1 + 0.00417);
        double sixthMonth = (100 + fifthMonth) * (1 + 0.00417);

        System.out.printf("After the sixth month,the account value is %.2f%n ", sixthMonth);
}
}
