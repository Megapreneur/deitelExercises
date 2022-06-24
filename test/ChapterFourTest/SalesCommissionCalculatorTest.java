package ChapterFourTest;

import ChapterFour.SalesCommissionCalculator;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class SalesCommissionCalculatorTest {
    @Test
    public void testThatSalesCommissionCanBeCreated(){
        SalesCommissionCalculator salesCommissionCalculator = new  SalesCommissionCalculator();
        assertNotNull(salesCommissionCalculator);
    }
    @Test
    public void testThatASalesPersonCanMakeASales(){
        SalesCommissionCalculator salesCommissionCalculator = new  SalesCommissionCalculator();
        salesCommissionCalculator.salesMade(5000);
        assertEquals(5000.0, salesCommissionCalculator.totalWeeklySales());
    }
    @Test
    public void testThatMultipleSalesCanBeMade(){
        SalesCommissionCalculator salesCommissionCalculator = new  SalesCommissionCalculator();
        salesCommissionCalculator.salesMade(5000);
        salesCommissionCalculator.salesMade(4000);
        salesCommissionCalculator.salesMade(3000);
        salesCommissionCalculator.salesMade(2000);
        salesCommissionCalculator.salesMade(1000);
        assertEquals(15000.0, salesCommissionCalculator.totalWeeklySales());
    }
    @Test
    public void testThat9_PercentWasGivenForAllSales(){
        SalesCommissionCalculator salesCommissionCalculator = new  SalesCommissionCalculator();
        salesCommissionCalculator.salesMade(4000);
        salesCommissionCalculator.salesMade(6000);
        salesCommissionCalculator.salesMade(4000);
        assertEquals(1460.0, salesCommissionCalculator.totalCommission());
    }
    @Test
    public void testThat9PercentAnd200DollarWasGivenForAllSalesMade(){
        SalesCommissionCalculator salesCommissionCalculator = new  SalesCommissionCalculator();
        salesCommissionCalculator.salesMade(1000);
        salesCommissionCalculator.salesMade(3000);
        salesCommissionCalculator.salesMade(1000);
        assertEquals(650.0, salesCommissionCalculator.totalCommission());
    }
}
