package ChapterSix;

import java.util.Scanner;

public class LeapYearMain {
    static LeapYear leapYear = new LeapYear();
    static Scanner input = new Scanner(System.in);
    static int year;
    public static void main(String[] args) {
        user();
        display();
    }
    private static void user(){
        System.out.print("Enter the year you will like to check: ");
        year = input.nextInt();
        leapYear.setYear(year);
    }
    private static void display(){
        System.out.println("============================================");
        System.out.println("Welcome to the Leap year indicator");
        System.out.println("============================================");
        if (leapYear.isLeapYear(year)){System.out.println(year + " is a leap year");}
        else {System.out.println(year + " is not a leap year");}
    }
}
