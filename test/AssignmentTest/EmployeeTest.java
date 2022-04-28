package AssignmentTest;

import EmployerPractice.Employee;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EmployeeTest {
    @Test
    public void employeeNameTest(){
        Employee worker = new Employee("Ademola Megbabi", "AD1234", "1/1/2020");
        worker.setName("Ademola Megbabi");
        assertEquals("Ademola Megbabi", worker.getName());
    }
    @Test
    public void employeeIDNumberTest(){
        Employee worker = new Employee("Ademola Megbabi", "AD1234", "1/1/2020");
        worker.setName("Ademola Megbabi");
        assertEquals("Ademola Megbabi", worker.getName());
        assertEquals("AD1234", worker.getNumber());
    }
    @Test
    public  void employeeDateOfBirthTest(){
        Employee worker = new Employee("Ademola Megbabi", "AD1234", "1/1/2020");
        worker.setName("Ademola Megbabi");
        worker.setDateOfBirth("1/1/2020");
        assertEquals("Ademola Megbabi", worker.getName());
        assertEquals("AD1234", worker.getNumber());
        assertEquals("1/1/2020", worker.getDateOfBirth());
    }
    @Test
    public void employeeSalaryTest(){
        Employee worker = new Employee("Ademola Megbabi", "AD1234", "1/1/2020");
        worker.setName("Ademola Megbabi");
        worker.setDateOfBirth("1/1/2020");
        worker.setSalary(12_000.00);
        assertEquals("Ademola Megbabi", worker.getName());
        assertEquals("AD1234", worker.getNumber());
        assertEquals("1/1/2020", worker.getDateOfBirth());
        assertEquals(12_000.00, worker.getSalary());
    }
    @Test
    public void employeeSalaryPaymentTypeTest(){
        Employee worker = new Employee("Ademola Megbabi", "AD1234", "1/1/2020");
        worker.setName("Ademola Megbabi");
        worker.setDateOfBirth("1/1/2020");
        worker.setSalary(12_000.00);
        worker.setSalaryPaymentType(3);
        assertEquals("Ademola Megbabi", worker.getName());
        assertEquals("AD1234", worker.getNumber());
        assertEquals("1/1/2020", worker.getDateOfBirth());
        assertEquals(36_000.00, worker.getSalary());
    }
}
