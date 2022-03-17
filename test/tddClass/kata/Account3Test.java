package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Account3Test {
    @Test
    public void depositTest(){
        Account3 ademolaAccount3 = new Account3();
        ademolaAccount3.deposit(5000);
        assertEquals(5000, ademolaAccount3.getBalance());
    }
    @Test
    public void doubleDepositTest(){
        Account3 ademolaAccount3 = new Account3();
        ademolaAccount3.deposit(5000);
        ademolaAccount3.deposit(4000);
        assertEquals(9000, ademolaAccount3.getBalance());
    }
    @Test
    public void tripleDepositTest(){
        Account3 ademolaAccount3 = new Account3();
        ademolaAccount3.deposit(2000);
        ademolaAccount3.deposit(5000);
        ademolaAccount3.deposit(5000);
        assertEquals(12000, ademolaAccount3.getBalance());
    }
    @Test
    public void negativeDepositTest(){
        Account3 ademolaAccount3 = new Account3();
        ademolaAccount3.deposit(-3000);
        assertEquals(0, ademolaAccount3.getBalance());
    }
    @Test
    public  void validAndInvalidDepositTEst(){
        Account3 ademolaAccount3 = new Account3();
        ademolaAccount3.deposit(5000);
        ademolaAccount3.deposit(-4000);
        assertEquals(5000, ademolaAccount3.getBalance());
    }
    @Test
    public void withdrawalTest(){
        Account3 ademolaAccount3 = new Account3();
        ademolaAccount3.withdraw(3000);
        assertEquals(0, ademolaAccount3.getBalance());
    }
    @Test
    public void doublewithdrawalTest(){
        Account3 ademolaAccount3 = new Account3();
        ademolaAccount3.withdraw(5000);
        ademolaAccount3.withdraw(4000);
        assertEquals(0, ademolaAccount3.getBalance());
    }
    @Test
    public void withdrawingMoreThanBalanceTest(){
        Account3 ademolaAccount3 = new Account3();
        ademolaAccount3.deposit(5000);
        ademolaAccount3.withdraw(6000);
        assertEquals(5000, ademolaAccount3.getBalance());
    }
}
