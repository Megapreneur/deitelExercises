package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class BankTest {
    private Bank zenithBank;

    @BeforeEach
    public void setUp(){
        zenithBank = new Bank("Zenith_Bank", 10);
    }

    @Test
    public void bankCanBeCreatedTest(){

        assertNotNull(zenithBank);
        assertEquals("Zenith_Bank", zenithBank.getName());
        assertEquals(10, zenithBank.getMaximumAmountOfCustomer());
    }
    @Test
    public void bankCanCreatAccountTest(){
        zenithBank.register("Ademola", "Megbabi", 5050);
        zenithBank.register("Ademola", "Megbabi", 5050);
        assertEquals(2, zenithBank.getNumberOfCustomer());
    }
    @Test
    public void createAccountCheckForFirstCustomerTest(){
        zenithBank.register("Ademola", "Megbabi", 5050);
        zenithBank.register("Ade", "Megbabi", 5051);
        zenithBank.register("ola", "Megbabi", 5052);
        zenithBank.register("demola", "Megbabi", 5053);
        assertEquals(4, zenithBank.getNumberOfCustomer());

        Account account = zenithBank.findAccount(4);
        assertEquals("demola Megbabi", account.getAccountName());
        assertEquals("4", account.getACCOUNT_NUMBER());


    }

}
