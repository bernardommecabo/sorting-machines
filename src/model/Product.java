package model;

import java.time.LocalDate;

public class Product {
    private String name;
    private String productId;
    private LocalDate dateAdded;
    private double price;

    public Product(String name,  String productId, LocalDate dateAdded, double price) {
        this.name = name;
        this.productId = productId;
        this.dateAdded = dateAdded;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }    
}
