package eBanking;

public class Bank {
    private String name;
    private Account[] accounts;
    private int numberOfCustomer;


    public Bank(String bankName, int numberOfCustomer) {
        name = bankName;
        accounts = new Account[numberOfCustomer];
    }
    public String getName() {return name;
    }
    public int getMaximumAmountOfCustomer() {return accounts.length;
    }
    public void register(String firstName, String lastName, int pin) {
        String accountNumber = (numberOfCustomer+1)+"";
        Account account = new Account(accountNumber,firstName, lastName, pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;

    }
    public int getNumberOfCustomer() {
        return  numberOfCustomer;
    }

    public Account findAccount(int accountNumber) {
//        int indexOfAccount = accountNumber - 1;
//        return accounts[indexOfAccount];
        return accounts[accountNumber-1];
    }
}
