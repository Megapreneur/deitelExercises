package tddClass.kata;

public class AutomaticBike {
    boolean AutomaticBike;

    int velocity;
    int speed;
    int accelerate;

    public void setBike(String mode) {
        if (mode == "on") {
            AutomaticBike = true;
        }
        if (mode == "off") {
            AutomaticBike = false;
        }
    }

    public boolean getBike() {
        return AutomaticBike;
    }

    public void acceleration(int velocity) {
       // if(speed < 0 ) {accelerate = 1;}
        {speed = velocity + accelerate;}
        
    }
    public int getAcceleration(){
        return speed;
    }
}