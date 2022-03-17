package tddClass.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Account4Test {
    @Test
    public void depositTest(){
        Account4 ademolaAccount4 = new Account4();
        ademolaAccount4.deposit(500);
        assertEquals(500, ademolaAccount4.getBalance());
    }
    @Test
    public void doubleDouble(){
        Account4 ademolaAccount4 = new Account4();
        ademolaAccount4.deposit(500);
        ademolaAccount4.deposit(1200);
        assertEquals(1700, ademolaAccount4.getBalance());
    }
    @Test
    public void negativeDeposit(){
        Account4 ademolaAccount4 = new Account4();
        ademolaAccount4.deposit(-4000);
        assertEquals(0, ademolaAccount4.getBalance());
    }
    @Test
    public void withdrawal(){
        Account4 ademolaAccount4 = new Account4();
        ademolaAccount4.withdraw(5000);
        assertEquals(0, ademolaAccount4.getBalance());
    }
    @Test
    public void doubleWithdrawal(){
        Account4 ademolaAccount4 = new Account4();
        ademolaAccount4.deposit(6000);
        ademolaAccount4.withdraw(3000);
        assertEquals(3000, ademolaAccount4.getBalance());
    }
    @Test
    public void withdrawingMoreThanBalance(){
        Account4 ademolaAccount4 = new Account4();
        ademolaAccount4.deposit(6000);
        ademolaAccount4.withdraw(3000);
        ademolaAccount4.withdraw(4000);
        assertEquals(3000, ademolaAccount4.getBalance());
    }
}
