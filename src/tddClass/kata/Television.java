package tddClass.kata;

public class Television {

    private boolean isOn;
    private int volume;


    public void turnOn() {
        isOn = !isOn;
    }
    public boolean getIsOn() {
        return isOn;
    }
    public void increaseVolume() {
        if(volume < 30)
        volume = volume + 1;
    }
    public int getVolume() {
        return volume;
    }
    public void decreaseVolume() {
        if(volume > 0)
        volume = volume - 1;
    }
}
