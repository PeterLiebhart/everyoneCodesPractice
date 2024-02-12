package io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise1;

import java.util.List;

public class Cart {
    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public Cart(List<CartItem> cartItemList, String nameOfOwner) {
        this.cartItemList = cartItemList;
        this.nameOfOwner = nameOfOwner;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    private List<CartItem> cartItemList;
    private String nameOfOwner;
}
