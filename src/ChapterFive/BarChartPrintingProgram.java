package ChapterFive;

import java.security.SecureRandom;


public class BarChartPrintingProgram {
    static int number;
    public static void main(String[] args) {
        obtainRandomNumbers();
        printingBarChart();

    }
    public static void obtainRandomNumbers(){
        SecureRandom random = new SecureRandom();
        number = random.nextInt(30) + 1;
    }
    public static void printingBarChart(){
        for (int i = 1; i < 6 ; i++) {
            obtainRandomNumbers();
            System.out.print(number+ " ");
            for (int j = 1; j <= number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
