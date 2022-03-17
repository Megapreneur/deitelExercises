package tddClass.kata;

public class Account3 {


    int balance;
    public void deposit(int amount) {
        if(amount > 0 )
        balance = balance + amount;
    }
    public void withdraw(int amount) {
        if(balance == 0 ) amount = 0;
        if(balance < amount) amount = 0;
        balance = balance - amount;
    }
    public int getBalance(){
        return balance;
    }


}
