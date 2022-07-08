package PersonalTest2;

import java.util.Scanner;

public class PhilipWork {
    private static final String[] names = new String[3];
    private static final int[] salaries = new int[names.length];
    static String name;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        officePaymentSlip();

    }
    private static String getNames(){
        System.out.println("Enter employee's name: ");
        return name = input.next();
    }
    private static int setSalaries(){
        System.out.println("Enter " + name + " salary: ");
        return  input.nextInt();
    }
    public static void officePaymentSlip(){
        int i;
        for (i = 0; i < names.length; i++) {
            names[i] = getNames();
            salaries[i] = setSalaries();
        }
        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j] + " receives " + salaries[j] + " monthly");
        }

    }
}
