package chapterTwo;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name: ");
        String yourName = input.next();

        name(yourName);

    }
    public static void name(String name){
        System.out.println("my name is " + name);
    }
}
