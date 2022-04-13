package ChapterSix;

public class LeapYear {
    boolean result;

    public void setYear(int year) {
        result = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
    public boolean isLeapYear(int year) {
        return result;
    }
}
