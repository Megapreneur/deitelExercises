package Assignments;

import java.util.Scanner;

public class TheTwelveDAydOfChristmasSong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1 - 12: ");
        int studentGrade = input.nextInt();
//
//        switch(day){
//            case 1
//        }
        if(studentGrade >= 90){
            System.out.println("A");
        }
        else {
            if(studentGrade >= 80){
                System.out.println("B");
            }
            else{
                if(studentGrade >= 70){
                    System.out.println("C");
                }
                else{
                    if(studentGrade >= 60){
                        System.out.println("D");
                    }
                    else{
                        System.out.println("F");
                    }
                }
            }
        }
        System.out.println(studentGrade >= 60 ? "Passed" : "Failed");
    }
}
