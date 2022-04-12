package Assignments;

import java.util.Scanner;

public class StudentGrade {
    static double average;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gradeCounterA = 0;
        int gradeCounterB = 0;
        int gradeCounterC = 0;
        int gradeCounterD = 0;
        int gradeCounterF = 0;
        int sum = 0;

        System.out.print("how many students?: ");
        int numberOfStudents = input.nextInt();

        for(int i = 1; i <= numberOfStudents; i++){
            System.out.print("Enter student name: ");
            input.next();

            System.out.print("Enter student score: ");
            int scores = input.nextInt();

            if(scores >= 90){
                System.out.println(scores + "A");
                gradeCounterA++;
            }
            else {
                if (scores >= 80) {
                    System.out.println(scores + "B");
                    gradeCounterB++;
                } else {
                    if (scores >= 70) {
                        System.out.println(scores + "C");
                        gradeCounterC++;
                    } else {
                        if (scores >= 60) {
                            System.out.println(scores + "D");
                            gradeCounterD++;
                        } else {
                            System.out.println(scores + "F");
                            gradeCounterF++;
                        }
                    }
                }
            }
            sum += scores;

        }
        average = (double) sum / numberOfStudents;

        System.out.println(gradeCounterA + " Grade A");
        System.out.println(gradeCounterB + " Grade B");
        System.out.println(gradeCounterC + " Grade C");
        System.out.println(gradeCounterD + " Grade D");
        System.out.println(gradeCounterF + " Grade F");

        System.out.println("the sum of all student scores is " + sum);
        System.out.println("The average score is " + average);


    }

}
