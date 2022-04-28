package Personal;

public class TimeToWork {
    public static void main(String[] args) {
        Time time = new Time(20,30,7);
        time.setTime(20,35,30);
        System.out.print(time.getHour() + ":" + time.getMinute()+ ":" + time.getSeconds());

    }

}
