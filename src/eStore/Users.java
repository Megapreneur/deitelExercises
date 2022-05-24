package eStore;

public class Users {
    int age;
    String emailAddress;
    String name;
    String password;
    String phone;
    HomeAddress homeAddress;

    public Users(int age, String emailAddress, String name, String password, String phone, HomeAddress homeAddress) {
        this.age = age;
        this.emailAddress = emailAddress;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.homeAddress = homeAddress;
    }
}
