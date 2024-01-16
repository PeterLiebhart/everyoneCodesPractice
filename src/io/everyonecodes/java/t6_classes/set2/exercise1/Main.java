package io.everyonecodes.java.t6_classes.set2.exercise1;

import java.util.List;

public class Main {
    public static List<Product> getProductsToPurchase(){
//    Returns a list of products to buy
        return List.of(
                new Product("apple", 2),
                new Product("orange", 3),
                new Product("beer", 4),
                new Product("tacos", 20)
        );
    }

    public static double getPricePerUnit(Product product){
        if (product.name.equals("apple")) {
            return 0.5;
        } else if (product.name.equals("orange")) {
            return 0.7;
        } else if (product.name.equals("beer")) {
            return 1.4;
        } else if (product.name.equals("tacos")) {
            return 0.3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        List<Product> products = getProductsToPurchase();
        double total = 0;
        for (Product product : products) {
            double pricePerUnit = getPricePerUnit(product);
            double price = pricePerUnit * product.amount;
            total += price;
        }
        System.out.println("Total: " + total);
    }
}
