package ExceptionExample;

public class Beans {
    private int numberOfSpoons;
    private boolean withOmiEwa;

    public Beans(int amount, boolean withOmiEwa){
        this.withOmiEwa = withOmiEwa;
        numberOfSpoons = amount / 50;
    }

    public String toString(){
        return String.format("%d is the amount of beans %s", numberOfSpoons, withOmiEwa? "with hot omiEwa.": ".");
    }
}
