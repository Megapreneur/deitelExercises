package PersonalTest2;


import java.security.SecureRandom;

public class PasswordGeneration2 {
    public static void main(String[] args) {
        String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] password = new char[12];
        SecureRandom nutmeg = new SecureRandom();

        for(int i = 0; i < 12; i++){
            password[i] = all.charAt(nutmeg.nextInt(all.length()));
        }
        System.out.println("The generated password is " + new String(password));


    }
}
