package eBanking;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class Account2Test {
    @Test
    public void accountCreationTest(){
        Account2 customer = new Account2("Megbabi", "Ademola", 23456, 1234);
       // "Megbabi", "Ademola", 23456, 1234
        assertNotNull(customer);
    }
    @Test
   public void accountDetailsTest(){
        Account2 customer = new Account2("Megbabi", "Ademola", 23456, 1234);
        assertEquals(23456, customer.getAccountNumber());
        assertEquals("Megbabi Ademola", customer.getAccountName());
    }
    @Test
    public void accountBalanceTest(){
        Account2 customer = new Account2("Megbabi", "Ademola", 23456, 1234);
        assertEquals(0, customer.getBalance(1234));
    }
    @Test
    public void correctPinTest(){
        Account2 customer = new Account2("Megbabi", "Ademola", 23456, 1234);
        assertEquals(-50, customer.getBalance(1222));
    }
    @Test
    public void depositTest(){
        Account2 customer = new Account2("Megbabi", "Ademola", 23456, 1234);
        customer.deposit(500);
        assertEquals(500, customer.getBalance(1234));
    }
    @Test
    public void doubleDepositTest(){
        Account2 customer = new Account2("Megbabi", "Ademola", 23456, 1234);
        customer.deposit(500);
        customer.deposit(2000);
        assertEquals(2500, customer.getBalance(1234));
    }
    @Test
    public void negativeDepositTest(){
        Account2 customer = new Account2("Megbabi", "Ademola", 23456, 1234);
        customer.deposit(-500);
        assertEquals(0, customer.getBalance(1234));
    }
    @Test
    public void withdrawalWithZeroBalanceTest(){
        Account2 Ademola = new Account2("Megbabi", "Ademola", 23456, 1234);
        Ademola.withdraw(500, 1234);
        assertEquals(0,Ademola.getBalance(1234));
    }
    @Test
    public void withdrawalTest(){
        Account2 Ademola = new Account2("Megbabi", "Ademola", 23456, 1234);
        Ademola.deposit(8000);
        Ademola.withdraw(5000, 1234);
        assertEquals(3000, Ademola.getBalance(1234));
    }
    @Test
    public void withdrawWithWrongPinTest(){
        Account2 Ademola = new Account2("Megbabi", "Ademola", 23456, 1234);
        Ademola.deposit(5000);
        Ademola.withdraw(2000, 1235);
        assertEquals(-50, Ademola.getBalance(1235));
    }


}
