package tddClass.kata;

public class AirConditioner<AirConditionerTemperature> {
    int AirConditionerTemperature;
    boolean AirConditioner;

    public void setAirConditioner(String mode) {
        if(mode == "on"){AirConditioner = true;
        }
        if(mode == "off"){AirConditioner = false;
        }
    }
    public boolean getAirConditioner() {
        return AirConditioner;
    }
    public int decreaseTemperature(){
        int decrease = 1;
        if(AirConditionerTemperature == 30) {decrease = 0;}
        AirConditionerTemperature = AirConditionerTemperature + decrease;
        return AirConditionerTemperature;
    }
    public int increaseTemperature(){
        int increase = 1;
        if(AirConditionerTemperature == 16) {increase = 0;}
        AirConditionerTemperature = AirConditionerTemperature - increase;
        return AirConditionerTemperature;
    }
    public void setTemperature(int setTemp) {
        AirConditionerTemperature = AirConditionerTemperature + setTemp;
    }
    public int getTemperature() {
    return AirConditionerTemperature;
    }

}
