package io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise1;

public class CartItem {

    private Product product;
    private int amountInCart;

    public int getAmountInCart() {
        return amountInCart;
    }

    public CartItem(Product product, int amountInCart) {
        this.product = product;
        this.amountInCart = amountInCart;
    }

    public Product getProduct() {
        return product;
    }

    public void setAmountInCart(int amountInCart) {
        this.amountInCart = amountInCart;
    }
}
