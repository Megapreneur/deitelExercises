package ChapterFive;

public class TheSumAndProductOfASeries {
    int minimumNumber;
    int maximumNumber;
    int sum = 0;
    long product = 1;
    public void setNumber(int minimumNumber, int maximumNumber) {
        this.minimumNumber = minimumNumber;
        this.maximumNumber = maximumNumber;
    }
    public int getNumber() {
        return maximumNumber;
    }
    public void series() {
        for(; minimumNumber<= maximumNumber; minimumNumber++){
            sum += minimumNumber;
            product = product * minimumNumber;
        }
    }
    public int getSumOfSeries() {return sum;}
    public long getProductOfSeries() {
        return product;
    }
}
