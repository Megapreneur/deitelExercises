package ChapterThree;

public class Car {
    public String model;
    public int year;
    public double amount;
    public double discount;
    public Car(String model, int year, double amount) {
        this.model = model;
        this.year = year;
        this.amount = amount;
    }
    public void setModel(String model) {this.model = model;
    }
    public String getModel() {return model;
    }
    public void setYear(int year) {this.year = year;
    }
    public int getYear() {return year;
    }
    public void setAmount(double amount) {this.amount = amount;
    }
    public double getAmount() {return  amount-(amount*(discount/100));
    }

    public void setDiscount(double discount) {this.discount = discount / 100;
    }

    public double getDiscount() {
        return discount;
    }
    public String toString(){

        return "The car model is " + model + "\n" +
                "It was produced in the year " + year + "\n" +
                "The price is " + amount + ".";
    }
}
