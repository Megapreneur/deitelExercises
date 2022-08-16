package Personal;


public class NumberOFDaysInYearAndMonth {
    public static void main(String[] args) {
        daysInYear(0);
    }
    public static void daysInYear(int days){
        int year = 360;
        int month = 30;

        if (days >= year){
            int numberOfYear = days / year;
            int numberOfMonth = days % year;
            if (numberOfMonth > 30){
                int remainingMonths = numberOfMonth / month;
                int remainingDays = numberOfMonth % month;
                System.out.printf("%d days is %d years, %d month(s) and %d days", days, numberOfYear,remainingMonths, remainingDays);
            }
            else {
                System.out.printf("%d days is %d years and %d days", days, numberOfYear, numberOfMonth);
            }
        }
        else {
            int numberOfMonth = days / 30;
            int numberOfDays = days % 30;
            System.out.printf("%d days is %d month and %d days", days,numberOfMonth, numberOfDays);
        }
    }
}
