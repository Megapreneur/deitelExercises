package AssignmentTest;

import EmployerPractice.PartTimeEmployee;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PartTimeEmployeeTest {
   @Test
    public void isAWorkerTest(){
       PartTimeEmployee newWorker = new PartTimeEmployee("Ademola", "AD1234", "1/1/2020", 1_200.00);
       assertEquals("Ademola", newWorker.getName());
       assertEquals("AD1234", newWorker.getNumber());
       assertEquals("1/1/2020", newWorker.getDateOfBirth());
   }
   @Test
   public void workerHourlyPayTest(){
      PartTimeEmployee newWorker = new PartTimeEmployee("Ademola", "AD1234", "1/1/2020", 1_200.00);
      newWorker.setHourlyPay(1_200.00);
      assertEquals(1_200.00, newWorker.getHourlyPay());
   }
   @Test
   public void workerWeeklyPayTest(){
      PartTimeEmployee newWorker = new PartTimeEmployee("Ademola", "AD1234", "1/1/2020", 1_200.00);
      newWorker.setHourlyPay(1_200.00);
      newWorker.calculateWeeklyPay(50);
      assertEquals(1_200.00, newWorker.getHourlyPay());
      assertEquals(60_000.00, newWorker.calculateWeeklyPay(50));
   }
}
