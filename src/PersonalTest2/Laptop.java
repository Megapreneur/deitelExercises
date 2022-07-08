package PersonalTest2;

public class Laptop {
    private String model;
    private String screenType;
    private double screenSize;
    private KeyBoard keyboard;
    private MotherBoard motherBoard;

    public String getModel() {
        return model;
    }

    public String getScreenType() {
        return screenType;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public KeyBoard getKeyboard() {
        return keyboard;
    }
    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
    public Laptop(String model, String screenType, double screenSize, KeyBoard keyboard, MotherBoard motherBoard) {
        this.model = model;
        this.screenType = screenType;
        this.screenSize = screenSize;
        this.keyboard = keyboard;
        this.motherBoard = motherBoard;
    }
}
