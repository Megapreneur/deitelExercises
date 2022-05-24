package eStore;

public class Product {
    String productName;
    int productID;
    double price;
    String productDescription;
    ProductCategories productCategories;

    public Product(String productName, int productID, double price, String productDescription, ProductCategories productCategories) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.productDescription = productDescription;
        this.productCategories = productCategories;
    }
}
