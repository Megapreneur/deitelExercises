package ChapterSix;

public class TemperatureConversions {
    private double kelvin;
    private double celsius;
    public void calculateKelvin(double celsius) {
        kelvin = celsius + 273.15;
    }
    public double getKelvin() {
        return kelvin;
    }
    public void calculateCelsius(double kelvin) {
        celsius = kelvin - 273.15;
    }
    public double getCelsius() {
        return celsius;
    }
}
