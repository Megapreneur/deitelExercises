package ExceptionExample;

public class Messenger {
    public Beans buyBeans(int amount, boolean omiEwa, boolean isFake){

        return sendSomebodyElse(amount,omiEwa,isFake);
    }
    private Beans sendSomebodyElse(int amount, boolean omiEwa, boolean isFake) {

        return gateMan(amount, omiEwa, isFake);
    }
    private Beans gateMan(int amount, boolean omiEwa, boolean isFake){
        if(amount < 50) throw new   NullPointerException("you dont have money");
        if (isFake) throw  new IllegalArgumentException("jail");
        return new Beans(amount,omiEwa);
    }
}



