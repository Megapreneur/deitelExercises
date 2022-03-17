package chapterTwo;

import java.util.Scanner;

public class FindTheNumberOfYears{
    public static void main(String[] args){

        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter the number in minutes: ");
        int minutes = prompt.nextInt();

        int minsInHour = 60;     
        int hoursInDay = 24;   
        int minsInDay = minsInHour * hoursInDay;
        int daysInYear = 365;         
        int minsInYear = minsInDay * daysInYear;    
 
        int year = minutes / minsInYear;
        int year2 = minutes % minsInYear;
        int yearReminder = year2 / minsInDay; 

        System.out.printf("%d  minutes is approximately %d years and %d days \n", minutes, year, yearReminder);
        
}
}
