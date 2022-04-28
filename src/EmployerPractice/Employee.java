package EmployerPractice;

public class Employee extends Boss{
    private String name;
    private final String number;
    private String DOB;
    private double salary;
    private int numberOfMonth;
    public Employee(String name, String number, String DOB){
        this.name = name;
        this.number = number;
        this.DOB = DOB;
    }
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public String getNumber() {return number;}
    public void setDateOfBirth(String DOB) {this.DOB = DOB;}
    public String getDateOfBirth() {return DOB;}
    public void setSalary(double salary) {this.salary = salary;}
    public double getSalary() {
        if(numberOfMonth == 0) numberOfMonth = 1;
        return salary * numberOfMonth;}
    public void setSalaryPaymentType(int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }
}
