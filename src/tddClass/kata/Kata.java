package tddClass.kata;

public class Kata {

    private boolean isOn;

//    public static int findMaximum(int[] scores) {
//        int maximum = Integer.MAX_VALUE;
//        if(int i = 0; i < scores.length; i++){
//            if(scores[i] > maximum){maximum = scores[i];}
//        }
//        return maximum;
//    }

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

    public int isTheLargestNumber(int firstNumber, int secondNumber, int thirdNumber, int fourNumber, int lastNumber) {
        int biggestNumber;
        biggestNumber = firstNumber;
        if (secondNumber > biggestNumber)biggestNumber = secondNumber;
        if (thirdNumber > biggestNumber)biggestNumber = thirdNumber;
        if(fourNumber > biggestNumber)biggestNumber = fourNumber;
        if(lastNumber > biggestNumber)biggestNumber = lastNumber;
        return biggestNumber;
    }


    public int isTheSmallestNumber(int i, int i1, int i2, int i3) {
        int smallestNumber;
        int smallestNumber1 = Math.min(i,i1);
        int smallestNumber2 = Math.min(i2,smallestNumber1);
        smallestNumber = Math.min(i3, smallestNumber2);
        
        return smallestNumber;
        
    }

    public int isTheLargestInteger(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int lastNumber) {
        int biggestNumber1 = Math.max(firstNumber,secondNumber);
        int biggestNumber2 = Math.max(thirdNumber,biggestNumber1);
        int biggestNumber3 = Math.max(fourthNumber, biggestNumber2);
        int biggestInteger = Math.max(lastNumber, biggestNumber3);
        return  biggestInteger;
    }

    public boolean isPalindrome(int integer) {
        int firstDigit = integer / 100000;
        int secondDigit = (integer % 100000)/10000;
        int thirdDigit = (integer % 10000)/1000;
        int fourthDigit = (integer % 1000)/100;
        int fifthDigit = (integer % 100)/10;
        int lastDigit = (integer % 10);

        if(firstDigit == lastDigit && secondDigit == fifthDigit && thirdDigit == fourthDigit) return true;
        return false;
    }

    public int isFactor(int integer) {
        int count = 0;
        int numberOfFactor = 1;
        while(numberOfFactor <= integer){
            if(integer % numberOfFactor == 0){
                count++;
            }
            numberOfFactor = numberOfFactor + 1;
        }
        return count;
    }
   public boolean isPrimeNumber(int number) {
//        int count = 1;
//        int primeNumber = 1;
//        boolean integer = false;
//        int digit = 1;
//        while (digit < number) {
//            digit++;
//            if (number % primeNumber == 0) {
//                count++;
//            }
//            primeNumber = primeNumber +1;
//        }
       return isFactor(number) <= 2;
   }

    public int arrayPrinting() {
        int sum = 0;
        int[] arry = new int[20];
        for (int i = 0; i < arry.length; i++) {
            sum = arry[i];

        }

        return sum;
    }
}

