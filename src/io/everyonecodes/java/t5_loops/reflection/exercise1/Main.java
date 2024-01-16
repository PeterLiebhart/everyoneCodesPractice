package io.everyonecodes.java.t5_loops.reflection.exercise1;

import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static List<String> getGuestList() {
        return List.of("Matilda", "Mugatu", "Derek", "Samantha");
    }

    public static void preparePiecesOfCake(int numberOfPieces) {
        System.out.println("Hansel is preparing " + numberOfPieces + " pieces of cake.");
    }

    public static void greetGuests(List<String> guestList) {
        for (String guest : guestList) {
            System.out.println("Hello " + guest + "!");
        }
    }
    public static int askGuestsForCake(List<String> guestList) {
        int cakeAmount = 0;
        for (String guest : guestList) {
            System.out.println("Hey " + guest + "! " + "Do you want a piece of cake? ");
            if (scanner.nextBoolean()) {
                cakeAmount += 1;
            }
        }
        return cakeAmount;
    }

    public static void main(String[] args) {

        List<String> guestList = getGuestList();

        greetGuests(guestList);

        int cakeAmount = askGuestsForCake(guestList);
        System.out.println("I will be right back with " + cakeAmount + " pieces of cake!");
        preparePiecesOfCake(cakeAmount);

    }
}
