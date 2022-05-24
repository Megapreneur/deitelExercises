package ChapterFour;

public class Comparator {
    private int firstNumber;
    private int secondNumber;
    private int status;

    public void inputTwoNumbers(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void compare() {
        status = Integer.compare(firstNumber, secondNumber);
    }

    public int getResult() {
        return status;
    }
}
