package io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise2;

import io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise1.Cart;
import io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise1.CartItem;

public class Cashier {

    public void BillCustomer(Cart cart) {
        double price = 0;
        for (CartItem item : cart.getCartItemList()) {
            price += item.getProduct().getPricePerUnitInEuro() * item.getAmountInCart();
        }
        System.out.println("Total cart price : " + price);

    }
}
