package PersonalTest2;

import java.util.Scanner;

public class StudentAnalysis {
    public static void main(String[] args) {
        int counterPass = 0;
        int counterFail = 0;
        int counter = 1;

        Scanner input = new Scanner(System.in);

        while (counter <= 10){
            System.out.print("Enter student score as 1 or 2: ");
            int score = input.nextInt();

            if(score == 1){
                System.out.println("Pass");
                counterPass++;
            }
            else{
                System.out.println("Fail");
                counterFail++;
            }
            counter++;

        }
        System.out.println(counterPass + " students passed the exam.");
        System.out.println(counterFail + " students failed the exam.");

        if(counterPass > 8){
            System.out.println("Bonus is to be given to the instructor.");
        }
    }
}
