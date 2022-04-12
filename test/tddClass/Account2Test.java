//package tddClass;
//
//import org.junit.jupiter.api.Test;
//import org.testng.annotations.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.testng.AssertJUnit.assertEquals;
//
//public class Account2Test {
//
//    @Test
//    public void depositTest(){
//        Account2 ademolaAccount2 = new Account2();
//        ademolaAccount2.deposit(100);
//        assertEquals(100, ademolaAccount2.getBalance());
//    }
//    @Test
//    public void doubleDepositTest(){
//        Account2 ademolaAccount2 = new Account2();
//        ademolaAccount2.deposit(2000);
//        ademolaAccount2.deposit(400);
//        assertEquals(2400, ademolaAccount2.getBalance());
//    }
//    @Test
//    public void tripleDepositTest(){
//        Account2 ademolaAccount2 = new Account2();
//        ademolaAccount2.deposit(2000);
//        ademolaAccount2.deposit(600);
//        ademolaAccount2.deposit(500);
//        assertEquals(3100, ademolaAccount2.getBalance());
//
//    }
//    @Test
//    public void negativeDepositTest(){
//        Account2 ademolaAccount2 = new Account2();
//        ademolaAccount2.deposit(-500);
//        assertEquals(0, ademolaAccount2.getBalance());
//    }
//    @Test
//    public void withdrawal(){
//        Account2 ademolaAccount2 = new Account2();
//        ademolaAccount2.deposit(5000);
//        ademolaAccount2.withdraw(2000);
//        assertEquals(3000, ademolaAccount2.getBalance());
//    }
//    @Test
//    public void doubleWithdrawalTest(){
//        Account2 ademolaAccount2 = new Account2();
//        ademolaAccount2.deposit(5000);
//        ademolaAccount2.withdraw(2000);
//        ademolaAccount2.withdraw(1200);
//        assertEquals(1800, ademolaAccount2.getBalance());
//    }
//
//    @Test
//    public void invalidWithdrawalTest(){
//        Account2 ademolaAccount2 = new Account2();
//        ademolaAccount2.deposit(5000);
//        ademolaAccount2.withdraw(6000);
//        assertEquals(5000, ademolaAccount2.getBalance());
//
//    }
//    @Test
//    public void validAndInvalidDepositTest(){
//        Account2 ademolaAccount2 = new Account2();
//        ademolaAccount2.deposit(5000);
//        ademolaAccount2.deposit(-500);
//        assertEquals(5000, ademolaAccount2.getBalance());
//    }
//}
