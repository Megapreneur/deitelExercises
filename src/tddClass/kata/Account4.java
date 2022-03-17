package tddClass.kata;


public class Account4 {
    private int balance;
    public void deposit(int amount) {
        if(amount > 0)
        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if(balance < amount ) amount = 0;
            balance = balance - amount;
    }
}
