package ChapterThree;

public class HealthProfile extends HeartRate {

    private double height;
    private double weight;
    private  String gender;
    double bmi;

    public HealthProfile(String firstName, String secondName, int month, int day, int yearOfBirth, String gender, double height, double weight) {
        super(firstName, secondName, month, day, yearOfBirth);
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int bmiCalculation() {
        bmi = (getWeight() * 703) / Math.pow(getHeight(), 2);
        return (int) bmi;
    }
}
