package ChapterFour;

public class FindTheLargestNumber {

    int largestNumber;
    public void collectNumbers(int digit1, int digit2, int digit3, int digit4, int digit5, int digit6, int digit7, int digit8, int digit9, int digit10) {
        largestNumber = Math.max(digit10,Math.max(digit9, Math.max(digit8, Math.max(digit7, Math.max(digit6, Math.max(digit5, Math.max(digit4, Math.max(digit3, Math.max(digit2, digit1)))))))));

    }
    public int getLargestNumber() {
        return largestNumber;
    }
}
