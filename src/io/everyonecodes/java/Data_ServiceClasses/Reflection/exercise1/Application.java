package io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise1;

public class Application {
    public static void main(String[] args) {
        Product firstProduct = new Product("Apple", 2.50);
        Product secondProduct = new Product("Wine", 5.80);
        secondProduct.setPricePerUnitInEuro(5.50);
        CartItem allFistProducts = new CartItem(firstProduct, 5);
        CartItem allSecondProducts = new CartItem(secondProduct, 2);
        allSecondProducts.setAmountInCart(3);
    }
}
