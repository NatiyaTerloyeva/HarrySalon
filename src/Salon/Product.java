package Salon;

public class Product {
    private String productName;
    private double productPrice;

    public Product() {

    }

    //GETTER

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;

    }

    //SETTER

    public void setProductName(String product) {
        this.productName = product;

    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;

    }

    public Product(String product, double productPrice) {
        setProductName(product);
        setProductPrice(productPrice);

    }

    public String toString() {
        return "Product{" +
                ", productName='" + productName + '\'' +
                ", productPrice= " + productPrice +
                '}';

    }
}
