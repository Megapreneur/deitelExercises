package eStore;

public class Customers extends Users {
    ShoppingCart shoppingCart;
    BillingInformation billingInformation;

    public Customers(int age, String emailAddress, String name, String password, String phone, HomeAddress homeAddress) {
        super(age, emailAddress, name, password, phone, homeAddress);
    }
}
