package PersonalTest2;

import java.util.Random;
import java.util.Scanner;

public class PasswordGeneration {
     Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String upper ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower ="abcdefghijklmnopqrstuvwxyz";
        String number ="0123456789";

        String combined = upper+lower+number;
        int len=12;
        char[] passwords = new char[12];
        Random rand = new Random();
        for(int i =0; i < len; i++){
            passwords[i] = combined.charAt(rand.nextInt(combined.length()));
        }
        System.out.println("Generated password is:" + new String(passwords));


    }
}
