package ChapterFour;

public class FindTheLargestNumber {
    int digit1;
    int digit2;
    int digit3;
    int digit4;
    int digit5;
    int digit6;
    int digit7;
    int digit8;
    int digit9;
    int digit10;
    int largestNumber;
    public void collectNumbers(int digit1, int digit2, int digit3, int digit4, int digit5, int digit6, int digit7, int digit8, int digit9, int digit10) {
        this.digit1 = digit1;
        this.digit2 = digit2;
        this.digit3 = digit3;
        this.digit4 = digit4;
        this.digit5 = digit5;
        this.digit6 = digit6;
        this.digit7 = digit7;
        this.digit8 = digit8;
        this.digit9 = digit9;
        this.digit10 = digit10;
    }
    public int getLargestNumber() {
        largestNumber = Math.max(digit10,Math.max(digit9, Math.max(digit8, Math.max(digit7, Math.max(digit6, Math.max(digit5, Math.max(digit4, Math.max(digit3, Math.max(digit2, digit1)))))))));
        return largestNumber;
    }
}
