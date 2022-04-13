package ChapterFiveTest;

import ChapterFive.ModifiedCompoundInterestProgram;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ModifiedCompoundInterestProgramTest {
    @Test
    public void numberOfYearTest(){
        ModifiedCompoundInterestProgram interest = new ModifiedCompoundInterestProgram();
        interest.setNumberOfYear(10);
        assertEquals(10, interest.getNumberOfYear());
    }
    @Test
    public void principalAmountTest(){
        ModifiedCompoundInterestProgram interest = new ModifiedCompoundInterestProgram();
        interest.setNumberOfYear(10);
        interest.setPrincipalAmount(1000.0);
        assertEquals(10, interest.getNumberOfYear());
        assertEquals(1000.0, interest.getPrincipalAmount());
    }
    @Test
    public void interestRateTest(){
        ModifiedCompoundInterestProgram interest = new ModifiedCompoundInterestProgram();
        interest.setNumberOfYear(10);
        interest.setPrincipalAmount(1000.0);
        interest.setInterestRate(5, 10);
        assertEquals(10, interest.getNumberOfYear());
        assertEquals(1000.0, interest.getPrincipalAmount());

    }
    @Test
    public void interestCalculationTest(){
        ModifiedCompoundInterestProgram interest = new ModifiedCompoundInterestProgram();
        interest.setNumberOfYear(10);
        interest.setPrincipalAmount(1000.0);
        interest.setInterestRate(5, 10);
        interest.interestCalculation();
        assertEquals(10, interest.getNumberOfYear());
        assertEquals(1000.0, interest.getPrincipalAmount());
        assertEquals(17531.167061100008, interest.getAmount());
    }
    @Test
    public  void interestCalculation2Test(){
        ModifiedCompoundInterestProgram interest = new ModifiedCompoundInterestProgram();
        interest.setNumberOfYear(20);
        interest.setPrincipalAmount(2000.0);
        interest.setInterestRate(5, 10);
        interest.interestCalculation();
        assertEquals(20, interest.getNumberOfYear());
        assertEquals(2000.0, interest.getPrincipalAmount());
        assertEquals(126004.99888516334, interest.getAmount());
    }


}
