package eBanking;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

class AccountTest {



    @Test
    public void accountCreatedTest(){
        Account account = new Account("12737", "Ademola", "Megbabi", 1267);
        assertNotNull(account);
    }
    @Test
    public void accountDetailsTest(){
        Account account = new Account("12737", "Ademola", "Megbabi", 1267);
        assertEquals("12737", account.getACCOUNT_NUMBER());
        assertEquals("Ademola Megbabi", account.getAccountName());
    }
    @Test
    public void depositTest(){
        Account account = new Account("12737", "Ademola", "Megbabi", 1267);
        assertEquals("12737", account.getACCOUNT_NUMBER());
        assertEquals("Ademola Megbabi", account.getAccountName());
        account.deposit(500);
        assertEquals(500, account.getBalance("1267"));
    }
    @Test
    public void doubleDepositTest() {
        Account account = new Account("12737", "Ademola", "Megbabi", 1267);
        assertEquals("12737", account.getACCOUNT_NUMBER());
        assertEquals("Ademola Megbabi", account.getAccountName());
        account.deposit(500);
        account.deposit(500);
        assertEquals(1000, account.getBalance("1267"));
    }
    @Test
    public void wrongPinDepositTest(){
        Account account = new Account("12737", "Ademola", "Megbabi", 1267);
        assertEquals("12737", account.getACCOUNT_NUMBER());
        assertEquals("Ademola Megbabi", account.getAccountName());
        account.deposit(500);
        account.deposit(500);
        assertEquals(0, account.getBalance("1277"));
    }
    @Test
    public void negativeDepositTest(){
        Account account = new Account("12737", "Ademola", "Megbabi", 1267);
        assertEquals("12737", account.getACCOUNT_NUMBER());
        assertEquals("Ademola Megbabi", account.getAccountName());
        account.deposit(500);
        account.deposit(500);
        account.deposit(-500);
        assertEquals(1000, account.getBalance("1267"));
    }
    @Test
    public void withdrawalTest(){
        Account account = new Account("12737", "Ademola", "Megbabi", 1267);
        assertEquals("12737", account.getACCOUNT_NUMBER());
        assertEquals("Ademola Megbabi", account.getAccountName());
        account.withdraw(500, "1267");
        assertEquals(0, account.getBalance("1267"));
    }
    @Test
    public void wrongPinForWithdrawalsTest(){
        Account account = new Account("12737", "Ademola", "Megbabi", 1267);
        assertEquals("12737", account.getACCOUNT_NUMBER());
        assertEquals("Ademola Megbabi", account.getAccountName());
        account.deposit(1500);
        account.withdraw(500, "1257");
        assertEquals(1500, account.getBalance("1267"));
    }
    @Test
    public void transferToAnotherAccountTest(){
        Account account = new Account("12737", "Ademola", "Megbabi", 1267);
        Account account1 = new Account("12222", "Ayoola", "Daniel", 1255);
        assertEquals("12737", account.getACCOUNT_NUMBER());
        assertEquals("Ademola Megbabi", account.getAccountName());
        assertEquals("12222", account1.getACCOUNT_NUMBER());
        assertEquals("Ayoola Daniel", account1.getAccountName());
        account.deposit(1500);
        account.transfer(500, "1257", account1);
        assertEquals(1000, account.getBalance("1267"));
        assertEquals(500, account1.getBalance("1255"));

    }

}
