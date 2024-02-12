package io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise1;

public class Product {

    private String name;
    private double pricePerUnitInEuro;

    public void setPricePerUnitInEuro(double pricePerUnitInEuro) {
        this.pricePerUnitInEuro = pricePerUnitInEuro;
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnitInEuro() {
        return pricePerUnitInEuro;
    }

    public Product(String name, double pricePerUnitInEuro) {
        this.name = name;
        this.pricePerUnitInEuro = pricePerUnitInEuro;
    }
}
