package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

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







}
