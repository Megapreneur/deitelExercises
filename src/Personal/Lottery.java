package Personal;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Nutmeg Lottery game. Please enter a Two digit number to win ₦1000000: ");
        int playersNumber = input.nextInt();

        Random rand = new Random();
        int lotteryNumber = rand.nextInt(98) + 1;

        int lotteryFirstDigit = lotteryNumber / 10;
        int lotterySecondDigit = lotteryNumber % 10;

        int playersNumber1 = playersNumber / 10;
        int playersNumber2 = playersNumber % 10;

        System.out.println("The lottery number is " + lotteryNumber);

        if(lotteryNumber == playersNumber)
            System.out.println("Exact match: you win ₦1,000,000");
        else if (lotterySecondDigit == playersNumber1 && lotteryFirstDigit == playersNumber2)
            System.out.println("Match all digits: you win ₦300,000");
        else if (playersNumber1 == lotteryFirstDigit || playersNumber1 == lotterySecondDigit || playersNumber2 == lotteryFirstDigit || playersNumber2 == lotterySecondDigit)
            System.out.println("Match one digit: you win ₦100,000");
        else
            System.out.println("Sorry, you lose");



    }
}
