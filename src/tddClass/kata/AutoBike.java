package tddClass.kata;

public class AutoBike {
    private boolean isOn;

    private int speed;

    public void isOn() {
        isOn = !isOn;
    }

    public boolean getOn() {
        return isOn;
    }

    public int acceleration() {
        if (speed < 20) {
            speed += 1;
        }else
            if (speed > 19 && speed < 30) {
                speed += 2;
            }else
                if (speed > 29 && speed < 40) {
                    speed += 3;
                }else
                    if (speed > 40) {
                        speed += 4;
                    }

        return speed;
    }
    public int getSpeed() {
        return speed;
    }

    public int deceleration() {
        if (speed >= 1 && speed < 20) {
            speed -= 1;
        }
        if (speed > 19 && speed < 30) {
            speed -= 2;
        }
        if (speed > 29 && speed < 40) {
            speed -= 3;
        }
        if (speed > 40) {
            speed -= 4;
        }
        return speed;
    }

}