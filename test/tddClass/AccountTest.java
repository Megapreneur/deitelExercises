package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest(){
        //given
        Account ademolaAccount = new Account("Megbabi Ademola");
        Account ademolaAccount2 = new Account("Alfa Goodness");
        //when
        ademolaAccount.deposit(100);
        ademolaAccount2.deposit(200);
        //assert
        assertEquals(100, ademolaAccount.getBalance());
        assertEquals(200, ademolaAccount2.getBalance());

    }

    @Test
    public void depositTwiceTest(){
        //given
        Account ademolaAccount = new Account("Megbabi Ademola");
        //when
        ademolaAccount.deposit(500);
        ademolaAccount.deposit(400);
        //check
        assertEquals(900, ademolaAccount.getBalance());
    }
    @Test
    @DisplayName("Test the nagative deposit will not work")
    public void negativeDepositTest(){
        Account ademolaAccount = new Account("Megababi Ademola");
        ademolaAccount.deposit(1000);
        ademolaAccount.deposit(-500);
        assertEquals(1000, ademolaAccount.getBalance());


    }
    @Test
    public void withdrawTest(){
        Account ademolaAccount = new Account("Megbabi Ademola ");
        ademolaAccount.withdraw(2000);
        assertEquals(3000, ademolaAccount.getBalance());
    }
    @Test
    public void overWithdrawalTest(){
        Account ademolaAccount = new Account("Megbabi Ademola");
        ademolaAccount.withdraw(7000);
        assertEquals(5000, ademolaAccount.getBalance());
    }
    @Test
    public void invalidWithdrawal(){
        Account ademolaAccount = new Account("Megbabi Ademola");
        ademolaAccount.withdraw(5000);
        assertEquals(0, ademolaAccount.getBalance());


    }
}
