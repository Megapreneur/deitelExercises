package tddClass.kata;

public class Ac {
    private boolean isOn;
    private int temperature = 16;

    public void isOn(boolean status) {
        isOn = status;
    }

    public boolean getOn() {
        return isOn;
    }

    public void setTemperature(int degree) {
        if (degree >= 16 && degree <= 30)
            temperature = degree;
        else if (degree >= 30)
            temperature = 30;
        else
            temperature = 16;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(temperature >= 16 && temperature <= 30)
        temperature += 1;
        if (temperature >= 30) {
            temperature = 30;
        }
    }

    public void decreaseTemperature() {
        if(temperature >= 16 && temperature <= 30)
        temperature -= 1;
        if(temperature <= 16) {
            temperature = 16;
        }
    }
}
