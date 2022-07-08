package PersonalTest2;// Create a program using maths. it should tell us how many days, weeks and months we have left. if 90 years is the reference age

import java.util.Scanner;

public class LifeInWeeks{
  public static void main(String[] args){

    Scanner life = new Scanner(System.in);
    System.out.print("What is your current age? ");

    int age = life.nextInt();
    int year = 90 - age;
    int month = year * 12;
    int week = year * 52;
    int day = year * 365;
    
    System.out.println("You have "+ day + " days "+ week + " weeks and " + month + " Months left! \n");
  }
}
