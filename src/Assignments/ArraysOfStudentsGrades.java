package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysOfStudentsGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of student: ");
        int numberOfStudent = input.nextInt();
        System.out.println("Enter the total number of subject offered: ");
        int numberOfSubject = input.nextInt();

        int[][] scores = new int[numberOfStudent][numberOfSubject];
        for (int i = 0; i < numberOfStudent; i++) {
            for (int a = 0; a < numberOfSubject; a++) {
                System.out.println("Enter student scores: ");
                int studentScore = input.nextInt();
                scores[i][a] = studentScore;
            }
        }
        for (int i = 0; i < numberOfStudent; i++) {
            for (int a = 0; a < numberOfSubject; a++) {

                System.out.print(scores[i][a]+ " ");


            }
            System.out.println();
        }
    }
}
