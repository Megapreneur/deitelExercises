package eBanking;
//String SurName, String FirstName, int AccountNumber, int Pin
public class Account2 {
   String name;
   int balance;
   public final int ACCOUNT_NUMBER;
   int Pin;
    public Account2(String SurName, String FirstName, int ACCOUNT_NUMBER, int Pin) {
        name = SurName+ " " + FirstName;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.Pin = Pin;
    }

    public int getAccountNumber() {return ACCOUNT_NUMBER;
    }

    public String getAccountName() {return name;
    }

    public int getBalance(int Pin) {
        if(this.Pin == Pin) return balance;
        return -50;
    }

    public void deposit(int Amount) {
        if(Amount > 0) balance += Amount;
    }

    public void withdraw(int Amount, int Pin) {
        if(this.Pin == Pin)
        if(Amount < balance) balance -= Amount;
    }
}
