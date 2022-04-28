package EmployerPractice;

import EmployerPractice.Employee;

public class PartTimeEmployee extends Employee {
    private double hourlyPay;
    private double pay;
    public PartTimeEmployee(String name, String number, String DOB, double hourlyPay) {
        super(name, number, DOB);
        this.hourlyPay = hourlyPay;
    }
    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    public double getHourlyPay() {
        return hourlyPay;
    }

    public double calculateWeeklyPay(int hours) {

        return hours * hourlyPay;
    }
}
