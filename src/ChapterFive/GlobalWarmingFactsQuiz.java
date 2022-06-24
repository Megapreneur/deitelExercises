package ChapterFive;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    private static final String [] quiz = new String [5];
    private static final String [] quizAnswers = new String[quiz.length];
    private static int passCounter = 0;
    private static int failCounter = 0;

    public static void main(String[] args) {
        welcome();
        question();
    }
    public static void welcome(){
        System.out.println("""
                Welcome to the IQ quiz
                """);
        quizQuestions();
        quizAnswers();
    }
    private static void quizQuestions(){
        quiz[0] = """
                1. How many states are there in Nigeria ?
                a. 32
                b. 34
                c. 35
                d. 36
                """;
        quiz[1] = """
                2. How many local government do we have in Nigeria ?
                a. 774
                b. 747
                c. 477
                d. 746
                """;
        quiz[2] = """
                3. How many sides do a pentagon have ?
                a. 8
                b. 7
                c. 6
                d. 5
                """;
        quiz[3] = """
                4. What is the odd one out ?
                a. lome
                b. abuja
                c. dakar
                d. kano
                """;
        quiz[4] = """
                5. What is the first capital of Nigeria ?
                a. abuja
                b. calabar
                c. lagos
                d. kaduna
                """;
    }
    private static void quizAnswers(){
        quizAnswers[0] = "d";
        quizAnswers[1] = "a";
        quizAnswers[2] = "d";
        quizAnswers[3] = "d";
        quizAnswers[4] = "c";

    }
    private static void question(){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < quiz.length; i++) {
            System.out.println(quiz[i]);
            String userResponse = input.next();
            if (userResponse.equalsIgnoreCase(quizAnswers[i])){
                System.out.println("Pass");
                passCounter++;
            }
            else {
                System.out.println("Fail");
                failCounter++;
            }
        }
        switch (passCounter){
            case 5 -> System.out.println("Excellent");
            case 4 -> System.out.println("Very good");
            case 3, 2, 1 -> System.out.println("Time to brush up your Knowledge");
        }
        System.out.println("You got " + passCounter + " number of question correctly");
        System.out.println("You failed " + failCounter + " questions");
    }
}
