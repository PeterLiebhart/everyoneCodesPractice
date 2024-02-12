package io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise2;

import io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise1.Cart;

public class Application {

    public static void main(String[] args) {
        ShopAssistant assistant = new ShopAssistant();
        Cart dereksCart = assistant.walkThroughShop("Derek");
        Cart hanselsCart = assistant.walkThroughShop("Hansel");

        Cashier cashier = new Cashier();
        cashier.BillCustomer(dereksCart);
        cashier.BillCustomer(hanselsCart);
    }
}
