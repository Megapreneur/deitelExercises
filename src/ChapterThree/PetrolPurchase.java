package ChapterThree;

public class PetrolPurchase {

    private String location;
    private String petrolType;
    private int quantity;
    private double price;



    public PetrolPurchase(String location, String petrol_Type, int quantity, double price) {
        this.location = location;
        petrolType = petrol_Type;
        this.quantity = quantity;
        this.price = price;

    }
    public void setLocation(String location) {this.location = location;
    }
    public String getLocation() {return location;
    }
    public void setPetrolType(String petrolType) {this.petrolType = petrolType;
    }
    public String getPetrolType() {return petrolType;
    }
    public void setQuantity(int quantity) {this.quantity = quantity;
    }
    public int getQuantity() {return quantity;
    }
    public void setPrice(double price) {this.price = price;
    }
    public double getPrice() {return price;
    }


}
