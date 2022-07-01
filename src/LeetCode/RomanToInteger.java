package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("Enter the roman numeral you will like to convert to integer: ");

        Scanner input = new Scanner(System.in);
        String userInput = input.next().toUpperCase();
        System.out.println(romanToInteger(userInput));
    }
    public static int romanToInteger(String roman){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i > 0 && map.get(roman.charAt(i)) > map.get(roman.charAt(i - 1))){
                result += map.get(roman.charAt(i)) - 2 * map.get(roman.charAt(i - 1));
            }else{
                result  += map.get(roman.charAt(i));
            }
        }
        return result;
    }
}
