package io.everyonecodes.java.t4_ifelse.set1.exercise2;

import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    static final Foods bigGearBurger = new Foods("Big Gear Burger", 6.50);
    static final Foods mcButtonsLongBurger = new Foods("Mc Buttons Long Burger", 7.20);
    static final Foods veggieCircuitsBurger = new Foods("Veggie Circuits Burger", 5.70);
    static final Foods frenchFries = new Foods("French Fries", 2.50);

    public static String askForBurger() {
        System.out.println("Good day! What burger do you want?");
        return scanner.nextLine();
    }

    public static boolean askForFries() {
        System.out.println("Do you want french fries with that?");
        return scanner.nextBoolean();
    }

    public static void main(String[] args) {
        String burger = askForBurger();
        boolean hasOrderedFries = askForFries();
        double totalPrice = 0;
        if (burger.equals(bigGearBurger.name)) {
            totalPrice += bigGearBurger.price;
        }
        else if (burger.equals(mcButtonsLongBurger.name)) {
            totalPrice += mcButtonsLongBurger.price;
    }
        else if (burger.equals(veggieCircuitsBurger.name)) {
            totalPrice += veggieCircuitsBurger.price;
        }
        if (hasOrderedFries) {
            totalPrice += frenchFries.price;
        }
        System.out.println("That'll be " + totalPrice + "Euro please!");
}
}
