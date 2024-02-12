package io.everyonecodes.java.Data_ServiceClasses.set2.exercise5;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {
    //Available shoes: new Shoe(39, "pink"), new Shoe(40, "red"), new Shoe(38, "blue"), new Shoe(42, "black")

    public static  void findShoeForCustomer(ShoeCustomer customer) {
        List<Shoe> shoeList = new ArrayList<>(List.of(new Shoe(39, "pink"), new Shoe(40, "red"), new Shoe(38, "blue"), new Shoe(42, "black")));
        for (Shoe shoe : shoeList) {
            if(shoe.getShoeSize() == customer.getShoeSizeOfCustomer()) {
                System.out.println("I will take the " + shoe.getColor() + " one!");
                return;
            }
            else {
                System.out.println("Nope, doesn't fit, sorry!");
            }
        }
    }
}
