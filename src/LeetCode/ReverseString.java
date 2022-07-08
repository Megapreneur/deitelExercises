package LeetCode;

import java.util.Scanner;

public class ReverseString {
    private static String reversedWord = "";
    public static void main(String[] args) {
       hm();

    }
    public static void  hm(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String userInput = input.next();
        System.out.println(reverseWord(userInput));
    }
    public static String reverseWord(String word){
        for (int i = word.length() - 1; i >= 0; i--) {
            char Word = word.charAt(i);
            reversedWord  += Word;
        }
        return reversedWord;
    }
}
