package ChapterSix;

import java.util.Scanner;

public class ParkingChargesMain {

    static Scanner input = new Scanner(System.in);
    private static String name;
    private static String carModel;
    private static String plateNumber;

    public static void main(String[] args) {


        printReceipt();

    }
    public static void printReceipt(){
        ParkingCharges parkingCharges = new ParkingCharges();


        getDriverName();
        getCarModel();
        getPlateNumber();
        System.out.println("=========================================================================================");
        System.out.println("Welcome to the Amazing Grace Parking Lot");
        System.out.println("=========================================================================================");

        System.out.println("The name of client is " + name + " who drove the car " + carModel + " with plate number " +
                plateNumber);
        parkingCharges.standardCharges(10);
        System.out.println("The Total charges for parking your car is ₦" + parkingCharges.getTotalCharges());
        System.out.println("=========================================================================================");


    }
    public static String getDriverName(){
        System.out.print("Enter drivers name: ");
        name = input.next();
        return name;
    }
    public static String getCarModel(){
        System.out.print("Enter car model: ");
        carModel = input.next();
        return carModel;
    }
    public static String getPlateNumber(){
        System.out.print("Enter car plate number: ");
        plateNumber = input.next();
        return plateNumber;
    }
}
