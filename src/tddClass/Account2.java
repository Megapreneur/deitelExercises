package tddClass;

public class Account2 {
    private int balance;
    public void deposit(int amount){
        if(amount <= 0) amount = 0;
        balance = amount + balance;

    }
    public void withdraw(int amount){
        if(amount > balance) {amount = 0;}
        balance = balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
