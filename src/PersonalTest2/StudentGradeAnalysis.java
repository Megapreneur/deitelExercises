package PersonalTest2;

import java.util.Scanner;

public class StudentGradeAnalysis {
    public static String name;
    static int sum;
    static int totalSum = 0;
    static double average;
    static double totalAverage;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many student do we have in the class: ");
        int numberOfStudent = input.nextInt();

        System.out.print("How many subject do you want to analyse: ");
        int numberOfSubjectOffered = input.nextInt();

        int[] scores = new int[numberOfSubjectOffered];
        String[] studentNames = new String[numberOfStudent];
        int[] sumOfScores = new int[numberOfStudent];
        double[]averageScores = new double[numberOfStudent];
//        String[] subjectName = new String[numberOfSubjectOffered + 1];

        for(int i = 1;i <= numberOfStudent; i++){
            sum = 0;
            System.out.print("Enter student name: ");
            name = input.next();
            studentNames[i] = name;

            for(int b = 1; b <= numberOfSubjectOffered; b++){
                System.out.print("Enter student scores: ");
                int studentScore = input.nextInt();
                scores[b] = studentScore;
                for(int a = 1; a <= numberOfStudent; a++){
                    sum = sum + studentScore;
                    sumOfScores[i] = sum;
                    average = (double)sum / numberOfSubjectOffered;
                    averageScores[i] = average;
                }



            }
//            System.out.println(sum);
//            System.out.println(average);

            totalSum += sum;
            totalAverage += average;

        }
        for(int i = 1; i <= numberOfStudent; i++){
            System.out.print(studentNames[i]);
            for(int b = 1; b <= numberOfSubjectOffered; b++){
                System.out.print(scores[b]);
            }
            for(int a = 1;a < 2;a++){
                System.out.print(sumOfScores[0]);
            }
            for(int a = 1; a < 2; a++){
                System.out.print(averageScores[0]);
            }

        }

        System.out.println(totalSum);
        System.out.println(totalAverage);





        }

    }

