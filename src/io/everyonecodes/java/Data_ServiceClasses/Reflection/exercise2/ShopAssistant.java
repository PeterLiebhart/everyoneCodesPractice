package io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise2;

import io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise1.Cart;
import io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise1.CartItem;
import io.everyonecodes.java.Data_ServiceClasses.Reflection.exercise1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {

    public Cart walkThroughShop(String name) {
        Scanner scanner = new Scanner(System.in);
        String input = "default";
        String productName;
        double price;
        int amount;
        List<CartItem> listOfCartItems = new ArrayList<>(List.of());
        while (!input.isBlank()) {
            System.out.println("What product do you want to add to your cart " + name + "?");
            productName = scanner.nextLine();
            input = productName;
            if (input.isBlank()) {
                break;
            }
            System.out.println("How much does it cost per unit?");
            price = scanner.nextDouble();
            System.out.println("How many of the product do you want to buy " + name + "?");
            amount = scanner.nextInt();
            scanner.nextLine();
            Product product = new Product(productName, price);
            listOfCartItems.add(new CartItem(product, amount));
        }
        return new Cart(listOfCartItems, name);

    }
}
