package ChapterFour;

public class GasMileage {
    int miles;
    int gallons;
    public void miles(int miles) {
        this.miles = miles;
    }
    public int getMiles() {
        return miles;
    }
    public void gallons(int gallons) {
        this.gallons = gallons;
    }

    public int getGallons() {
        return gallons;
    }
    public double getMilePerGallon() {

        return (double)miles/ gallons;
    }
}
