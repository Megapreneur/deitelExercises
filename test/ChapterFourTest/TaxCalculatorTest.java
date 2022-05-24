package ChapterFourTest;

import ChapterFour.TaxCalculator;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class TaxCalculatorTest {
    @Test
    public void createCalculatorTest(){
        TaxCalculator casio = new TaxCalculator();
        assertNotNull(casio);
    }
    @Test
    public void citizenNameTest(){
        TaxCalculator casio = new TaxCalculator();
        casio.citizenName("Ade");
        assertEquals("Ade", casio.getCitizenName());
    }
    @Test
    public void earningCanBeTaxedTest(){
        TaxCalculator casio = new TaxCalculator();
        casio.citizenName("Ade");
        casio.citizenEarning(30_000);
        assertEquals(25_500.00, casio.getCitizenEarning());
    }

    @Test
    public void earningEqualOrBelow30_000Test(){
        TaxCalculator casio = new TaxCalculator();
        casio.citizenName("Ade");
        casio.citizenEarning(30_000);
        assertEquals(25_500.00, casio.getCitizenEarning());
    }
    @Test
    public void earningAbove30_000(){
        TaxCalculator casio = new TaxCalculator();
        casio.citizenName("Ade");
        casio.citizenEarning(40_000);
        assertEquals(33_500.0, casio.getCitizenEarning());
    }

}
