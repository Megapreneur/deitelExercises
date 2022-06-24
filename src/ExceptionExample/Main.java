package ExceptionExample;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Beans beans = messenger.buyBeans(300,false,false);
        System.out.println(beans);
    }
}
