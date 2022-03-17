package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Arithmetic2Test {
    @Test
    public void ArithmeticTest(){
        Arithmetic calculation = new Arithmetic();
        int square = calculation.arithmeticSquare(4);
        assertEquals(16, square);
    }
    @Test
    public void Arithmetic2Test(){
        Arithmetic calculation = new Arithmetic();
        int square = calculation.arithmeticSquareNumber(6);
        assertEquals(36, square);
    }
    @Test
    public void SumOfSquareTest(){
        Arithmetic calculation = new Arithmetic();
        int sum = calculation.sumOfSquare(5,4);
        assertEquals(41, sum);
    }
    @Test
    public void differenceOfSquareTest(){
        Arithmetic calculation = new Arithmetic();
        int difference = calculation.differenceOfSum(6,4);
        assertEquals(20, difference);
    }
}
