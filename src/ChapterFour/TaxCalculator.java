package ChapterFour;

public class TaxCalculator {
    private String name;
    private double earning;

    public void citizenName(String name) {
        this.name = name;
    }

    public String getCitizenName() {
        return name;
    }

    public void citizenEarning(double earning) {
        this.earning = earning;
    }

    public double getCitizenEarning() {
        int taxRate = 15;
        int taxRate2 = 20;
        double takeHome;
        if(earning <= 30_000) {
            takeHome = earning - (earning * ((double) taxRate / 100));}
        else
            {
                takeHome = (30_000 - (30_000* ((double) taxRate / 100))) + ((earning - 30_000)-(earning - 30_000) * ((double) taxRate2 / 100));}

        return takeHome;
    }
}
