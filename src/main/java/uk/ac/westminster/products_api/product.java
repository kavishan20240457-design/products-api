package uk.ac.westminster.products_api;

import io.swagger.v3.oas.annotations.media.DependentRequired;

public class product {
    private Long id;
    private String name;
    private double price;

    public product() {
    }

    public product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }
// Jackson looks for a public getX() method for each field; with no getName() there is nothing for it to call, so the field is skipped.
//    public String getName() {
//        return name;
//    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}