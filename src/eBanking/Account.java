package eBanking;

public class Account {
    private final String ACCOUNT_NUMBER;
    public String AccountName;
    public int balance;
    private int pin;


    public Account(String AccountNumber, String FirstName, String LastName, int pin) {
        this.ACCOUNT_NUMBER = AccountNumber;
        this.AccountName = FirstName+ " "  +LastName;
        this.pin = pin;
    }

    public String getACCOUNT_NUMBER() {return ACCOUNT_NUMBER;}

    public String getAccountName() {return AccountName;}

    public void deposit(int amount) {
        if(amount > 0)
        balance = balance + amount;
    }

    public int getBalance(String pin) {
        if(pin.equals(this.pin)) return balance;
        return 0;
    }

    public void withdraw(int amount, String pin) {
        if(pin.equals(this.pin))
            if(balance > amount)
        balance = balance - amount;
    }

    public void transfer(int amount, String pin,Account  Reciever) {
        this.balance -= amount;
         Reciever.deposit(amount);
    }
}
