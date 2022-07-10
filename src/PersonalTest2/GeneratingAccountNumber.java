package PersonalTest2;

import java.security.SecureRandom;

public class GeneratingAccountNumber {
    public static void main(String[] args) {
        String number = "0123456789";

        int len = 10;

        char[] accountNumber = new char[len];
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < len; i++) {
            accountNumber[i] = number.charAt(random.nextInt(number.length()));

        }
        System.out.println("Generated password is:" + new String(accountNumber));


    }
}
