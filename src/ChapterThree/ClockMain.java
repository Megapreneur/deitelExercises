package ChapterThree;

import java.util.Scanner;

public class ClockMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the seconds: ");
        int seconds = input.nextInt();
        System.out.println("Enter the minutes: ");
        int minutes = input.nextInt();
        System.out.println("Enter the hour: ");
        int hours = input.nextInt();

        Clock ago = new Clock(seconds,minutes,hours);
        ago.setSeconds(seconds);
        ago.setMinutes(minutes);
        ago.setHours(hours);
        System.out.println(ago);
    }
}
