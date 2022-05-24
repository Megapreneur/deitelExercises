package tddClass.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


public class KataTest {
    private int bit;

    @Test
    public void addTest(){

        Kata calculator = new Kata();
        int actual = calculator.add(4, 3);
        assertEquals(7, actual);
    }

    @Test
    public void SubtractTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 7);
        assertEquals(5, result);
    }
    @Test
    public void CalculatingAreaTest(){
        Kata circle = new Kata();
        double area = circle.findingAreaWith(7);
        assertEquals(154.0, area);

    }
    @Test
    public void bitFlipperTest(){
        Kata flipper = new Kata();
        int result = flipper.flip(bit = 0);
        assertEquals(1, result);
        result = flipper.flip(bit = 1);
        assertEquals(0, result);
    }
    @Test
    public void squareTest(){
        Kata squareNumber = new Kata();
        int result = squareNumber.square(5);
        assertEquals(25, result);
    }
    @Test
    public void quotientTest(){
        Kata numberQuotient = new Kata();
        int result = numberQuotient.quotient(2,8);
        assertEquals(4, result);
    }
    @Test
    public void additionTest() {
        Kata add = new Kata();
        int number = 0;
        while (number <= 30) {
            System.out.print(number + " ");
            number = number + 5;
        }
    }
    @Test
    public void bmiTest(){
        Kata bmi = new Kata();
        int bmiCal = bmi.bodyMassIndex(96, 2);
        assertEquals(24, bmiCal);
    }
    @Test
    public void isOnTest(){
        Kata on = new Kata();
        on.turnIsOn();
        on.turnIsOn();
        assertEquals(false, on.getIsOn());
    }
    @Test
    public void isEvenTest(){
        Kata even = new Kata();
        boolean integer = even.isEven(30);
        assertTrue(integer);
    }
    @Test
    public void isOddTest(){
        Kata even = new Kata();
        boolean integer = even.isEven(31);
        assertFalse(integer);
    }
    @Test
    public void isBiggestTest(){
        Kata biggest = new Kata();
        int biggestNumber = biggest.isTheLargestNumber(40,16,37,10,22);
        assertEquals(40, biggestNumber);
    }
    @Test
    public void isSmallestTest(){
        Kata smallest = new Kata();
        int smallestNumber = smallest.isTheSmallestNumber(17,13,16, 8);
        assertEquals(8, smallestNumber);
    }
    @Test
    public void isBiggestNumberTest(){
        Kata biggest = new Kata();
        int biggestInteger = biggest.isTheLargestInteger(12,14,16,10,7);
        assertEquals(16, biggestInteger);
    }
    @Test
    public void palindromeTest(){
        Kata palindrome = new Kata();
        boolean number = palindrome.isPalindrome(123321);
        assertEquals(true,number);
    }
    @Test
    public  void factorTest(){
        Kata numberOfFactor = new Kata();
        int count = numberOfFactor.isFactor(100);
        assertEquals(9, count);
    }
    @Test
    public void primeNumberTest(){
        Kata numberPrime = new Kata();
        boolean integer = numberPrime.isPrimeNumber(29);
        assertEquals(true,integer);
    }
    @Test
    public void classWorkTest(){
        Kata playPlay = new Kata();
        playPlay.arrayPrinting();
        assertEquals(0,playPlay.arrayPrinting());
    }









}
