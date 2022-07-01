package LeetCode;

import java.util.Scanner;

public class IntegerToRoman {
    private static String roman;
    static Scanner input = new Scanner(System.in);
    static  int userInput;
    public static void main(String[] args) {
        System.out.println("Enter the number you will like to convert to roman numerals: ");
        userInput = input.nextInt();
        System.out.println(integerToRoman(userInput));

    }
    public static String integerToRoman( int userInput){
        String[] thousand = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        roman = thousand[userInput / 1000] + hundreds[(userInput % 1000) / 100] + tens[(userInput % 100) / 10] + units[(userInput % 10)];

        return roman;
    }
}
