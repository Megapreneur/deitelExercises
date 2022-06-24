package ChapterFour;

public class SalesCommissionCalculator {
    private double totalSales = 0;

    public void salesMade(double amount) {
        totalSales += amount;
    }

    public double totalWeeklySales() {
        return totalSales;
    }

    public double totalCommission() {
        return totalSales * ((double) 9 / 100) + 200;
    }
}
