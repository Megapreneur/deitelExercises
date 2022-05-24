package ChapterFive;

import java.util.Scanner;

public class StudentGrades {
    static Scanner input = new Scanner(System.in);
    private static int numberOfStudent;
    private static String studentName;
    private static int studentScore;

    public static void main(String[] args) {
        numberOfStudent();
        studentNameAndGrade();

    }
    public static void numberOfStudent(){
        System.out.print("How many student took the exam? ");
        numberOfStudent = input.nextInt();
    }
    public static void studentGrade(){
       switch (studentScore){


       }
    }
    public static void studentNameAndGrade(){
        for (int i = 1; i <= numberOfStudent; i++) {
            System.out.print("Enter student name: ");
            studentName = input.next();
            System.out.print("Enter "+studentName +" score: ");
            studentScore = input.nextInt();
        }
        System.out.println(studentName);

    }
}
