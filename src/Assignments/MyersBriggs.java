package Assignments;

import java.util.Scanner;

public class MyersBriggs {
    static String  userInput;
    static int extrovertCounter = 0;
    static int introvertCounter = 0;
    static int sensitiveCounter = 0;
    static int intuitionCounter = 0;
    static int thinkerCounter = 0;
    static int feelerCounter = 0;
    static int judgingCounter = 0;
    static int perceptiveCounter = 0;

    public static void main(String[] args) {
        display();
        printCounter();
        comparative();

    }
    public static void display(){

        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 20 ; i++) {
            System.out.println("Enter A or B: ");
            switch  (i){
                case 1 -> {
                    System.out.println("""
                            1.
                            A. expend energy, enjoy groups
                            B. conserve energy, enjoy one-on-one
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) extrovertCounter++;
                    else
                        introvertCounter++;
                }
                case  2 ->{
                    System.out.println("""
                            2.
                            A. interpret literally
                            B. look for meaning and possibilities
                            """);
                    userInput = input.next();
                    if(userInput.equalsIgnoreCase("A")) sensitiveCounter++;
                    else
                        intuitionCounter++;
                }
                case  3 ->{
                    System.out.println("""
                            3.
                            A. logical, thinking, questioning
                            B. empathetic, feeling, accommodating
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) thinkerCounter++;
                    else
                        feelerCounter++;
                }
                case  4 ->{
                    System.out.println("""
                            4.
                            A. organized, orderly
                            B. flexible, adaptable
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) judgingCounter++;
                    perceptiveCounter++;
                }
                case  5 ->{
                    System.out.println("""
                            5.
                            A. more outgoing, think out loud
                            B. more reserved, think to yourself
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) extrovertCounter++;
                    else
                        introvertCounter++;
                }
                case  6 ->{
                    System.out.println("""
                            6.
                            A. practical, realistic, experimental
                            B. imaginative, innovative, theoretical
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) sensitiveCounter++;
                    else
                        intuitionCounter++;
                }
                case  7 ->{
                    System.out.println("""
                            7.
                            A. candid, straight forward, frank
                            B. tactful, kind, encouraging
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) thinkerCounter++;
                    else
                        feelerCounter++;
                }
                case  8 ->{
                    System.out.println("""
                            8.
                            A. plan, schedule
                            B. unplanned, spontaneous
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) judgingCounter++;
                    else
                        perceptiveCounter++;
                }
                case  9 ->{
                    System.out.println("""
                            9.
                            A. seek many tasks, public activities, interaction with others
                            B. seek private, solitary activities with quiet to concentrate
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) extrovertCounter++;
                    else
                        introvertCounter++;
                }
                case  10 ->{
                    System.out.println("""
                            10.
                            A. standard, usual, conventional
                            B. different, novel, unique
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) sensitiveCounter++;
                    else
                        intuitionCounter++;
                }
                case  11 ->{
                    System.out.println("""
                            11.
                            A. firm, tend to criticize, hold the line
                            B. gentle, tend to appreciate, conciliate
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) thinkerCounter++;
                    else
                        feelerCounter++;
                }
                case  12 ->{
                    System.out.println("""
                            12.
                            A. regulated, structured
                            B. easygoing, 'live' and 'let live
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) judgingCounter++;
                    else
                        perceptiveCounter++;
                }
                case  13 ->{
                    System.out.println("""
                            13.
                            A. external, communicative, express yourself
                            B. internal, reticent, keep to yourself
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) extrovertCounter++;
                    else
                        introvertCounter++;
                }
                case  14 ->{
                    System.out.println("""
                            14.
                            A. focus on here-and-now
                            B. look to the future, global perspective, 'big picture
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) sensitiveCounter++;
                    else
                        intuitionCounter++;
                }
                case  15 ->{
                    System.out.println("""
                            15.
                            A. tough-minded, just
                            B. tender-hearted, merciful
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) thinkerCounter++;
                    else
                        feelerCounter++;
                }
                case  16 ->{
                    System.out.println("""
                            16.
                            A. preparation, plan ahead
                            B. go with the flow, adapt as you go
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) judgingCounter++;
                    else
                        perceptiveCounter++;
                }
                case  17 ->{
                    System.out.println("""
                            17.
                            A. active, initiate
                            B. reflective, deliberate
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) extrovertCounter++;
                    else
                        introvertCounter++;
                }
                case  18 ->{
                    System.out.println("""
                            18.
                            A. facts, things, 'what-is
                            B. ideas, dreams,'what could be', philosophical
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) sensitiveCounter++;
                    else
                        intuitionCounter++;
                }
                case  19->{
                    System.out.println("""
                            19.
                            A. matter of fact, issue-oriented
                            B. sensitive, people-oriented, compassionate
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) thinkerCounter++;
                    else
                        feelerCounter++;
                }
                case  20 ->{
                    System.out.println("""
                            20.
                            A. control, govern
                            B. latitude, freedom
                            """);
                    userInput = input.next();
                    if (userInput.equalsIgnoreCase("A")) judgingCounter++;
                    else
                        perceptiveCounter++;
                }

            }

        }
    }
    public static void printCounter(){
        System.out.println("Extrovert = "+extrovertCounter);
        System.out.println("Introvert = "+introvertCounter);
        System.out.println("Sensitive = "+sensitiveCounter);
        System.out.println("Intuition = "+intuitionCounter);
        System.out.println("Thinkers = "+thinkerCounter);
        System.out.println("Feelers = "+feelerCounter);
        System.out.println("Judging = "+judgingCounter);
        System.out.println("Perceptive = "+perceptiveCounter);
    }
    public static  void comparative(){
        System.out.println(Math.max(extrovertCounter, introvertCounter));
        System.out.println(Math.max(sensitiveCounter, intuitionCounter));
        System.out.println(Math.max(feelerCounter, thinkerCounter));
        System.out.println(Math.max(judgingCounter, perceptiveCounter));
    }

}
