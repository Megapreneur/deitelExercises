package ChapterSix;

public class ParkingCharges {

    private double totalCharges;

    public void standardCharges(int hours) {
        int extraPay;
        if(hours >= 3){
            extraPay = hours - 3;
            totalCharges = 2 + (extraPay * 0.5);
        }
        else{
            totalCharges = 2;
        }
    }

    public double getTotalCharges() {
        return totalCharges;
    }
}
