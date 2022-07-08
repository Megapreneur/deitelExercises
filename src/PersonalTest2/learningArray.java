package PersonalTest2;

import java.util.Scanner;

public class learningArray {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int i;
        int[] myIntArray = new int[101];
        for (i = 1; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);
        sumOfArray(myIntArray);
        collectNumber();
    }
    public static void sumOfArray(int[] array){
        int sum = 0;
        int i;
        for (i = 1; i < array.length; i++) {

            sum += array[i];
        }
        double average = sum / i;
        System.out.println("The sum of " + i + " is " + sum);
        System.out.println("The average of " + i + " is " + average);
    }
    public static void printArray(int[] array ){
        for (int i = 1; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
    public static void collectNumber(){
        int sum = 0;
        int average;
        int i;
        System.out.println("Enter the array length: ");
        int sizeOfArray = input.nextInt();
        int [] arr = new int[sizeOfArray];

        for (i = 0;i < arr.length; i++) {
            System.out.println("Enter a number: ");
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        average = sum / i;
        System.out.println("The sum of " + i + " is " + sum);
        System.out.println("The average of " + i + " numbers is " + average);
    }
}
