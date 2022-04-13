package ChapterFive;

public class ModifiedCompoundInterestProgram {
    int numberOfYear;
    double principalAmount;
    double amount;
    double sum = 0;
    int startingRate;
    int endingRate;

    public void setNumberOfYear(int numberOfYear) {this.numberOfYear = numberOfYear;}
    public int getNumberOfYear() {return numberOfYear;}
    public void setPrincipalAmount(double principalAmount) {this.principalAmount = principalAmount;}
    public double getPrincipalAmount() {return principalAmount;}

    public void interestCalculation() {
        for(int year = 1; year <= numberOfYear; year++ ){
            for (startingRate = 5; startingRate <= endingRate; startingRate++)
             amount = principalAmount * Math.pow(1.0 + (double)(startingRate) / 100, year);
             sum +=amount;
        }
    }
    public void setInterestRate(int startingRate, int endingRate) {
        this.startingRate = startingRate;
        this.endingRate = endingRate;
    }
    public double getAmount() {return sum;
    }
}
