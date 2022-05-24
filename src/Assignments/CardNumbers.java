package Assignments;

import java.util.Scanner;

public class CardNumbers {
    static int sum = 0;
    static int total = 0;
    static int card;
    static Scanner input = new Scanner(System.in);
    static int cardNumber;
    static int[] arr = new int[cardNumber];

        public static void main(String[] args) {
            cards();
            printingCardNumbers();
        }
        public  static void cards() {


            System.out.println("enter 13 numbers: ");
            cardNumber = input.nextInt();

            System.out.println("enter cardNumber");
            for (int i = 0; i < cardNumber; i++) {
                arr[i] = input.nextInt();
            }

        }
        public static void printingCardNumbers(){
            for (int i = 0; i < cardNumber; i += 2) {
                System.out.println(arr[i] * 2);
                card = arr[i] * 2;
                if (card > 9) {
                    int i1 = card * 10 % 10;
                    int i2 = card % 10;
                    sum = i1 + i2;
                }
                total = arr[i] + sum;
            }
            System.out.println(total);
        }
}
