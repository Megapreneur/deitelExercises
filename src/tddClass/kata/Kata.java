package tddClass.kata;

public class Kata {

    private boolean isOn;

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if(firstNumber < secondNumber) {result = secondNumber - firstNumber;}
        if(firstNumber > secondNumber) {result = firstNumber - secondNumber;}
        return result;
    }
    public double findingAreaWith(int radius){
        return (22 * radius * radius)/ 7.0;
    }
    public int flip(int bit){
        int result = 0;
        if(bit == 0) result = 1;
        if(bit == 1) result = 0;
        return result;
    }
    public int square(int number) {
        int value = number * number;
        return value;
    }

    public int quotient(int firstNumber, int secondNumber) {
        int result = 0;
        if(firstNumber > secondNumber){ result = firstNumber / secondNumber;}
        else
        {result = secondNumber / firstNumber;}
        return result;
    }

    public int bodyMassIndex(int weight, int height) {
        int bmi =0;
        bmi = weight / (height * height);
        return bmi;
    }

    public void turnIsOn() {
        isOn = !isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public boolean isEven(int number) {
        boolean integer = number % 2 == 0;
        return integer;
    }
}

