package ChapterThree;

public class HeartRate {
    private  String name;
    private  int month;
    private  int day;
    private int yearOfBirth;
    private int age;

    public HeartRate(String firstName, String secondName, int month, int day, int yearOfBirth){
        name = firstName + " " + secondName;
        this.month = month;
        this.day = day;
        this.yearOfBirth = yearOfBirth;
    }
    public String getName() {
        return name;
    }

    public void setName(String firstName, String secondName) {

        name = firstName + " " + secondName; ;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public int calculateAge(int currentYear) {
        age = currentYear - yearOfBirth;
        return age;
    }
    public int maximumHeartRate() {
        return 220 - age;
    }
    public double targetHeartRate(int percentageRange) {
        return ((double) percentageRange / 100) * maximumHeartRate();
    }
}
