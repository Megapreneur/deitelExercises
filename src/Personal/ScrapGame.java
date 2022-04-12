package Personal;

import java.security.SecureRandom;
import java.util.Scanner;

public class ScrapGame {
    static SecureRandom rand = new SecureRandom();
    public static int dice1;
    public static int dice2;
    public static int sum;
    public static String result;

    public static void main(String[] args) {
        startGame();
        rollDice();
        mode();

    }

    public static void startGame() {
        System.out.println("Welcome to the crap game. Enter a number to begin: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
    }

    public static int rollDice() {
        dice1 = rand.nextInt(1, 7);
        dice2 = rand.nextInt(1, 7);

        sum = dice1 + dice2;
        return sum;
    }

    public static String mode() {
        if (sum == 7 || sum == 11) {
            result = "You won";
            System.out.println(result);}
        else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
                result = "You need to get " + result + " to win";
                System.out.println(result);}
        else{
            result = "You need to get " + result + " to win";
            System.out.println(result);
        }
        return result;
    }
}
