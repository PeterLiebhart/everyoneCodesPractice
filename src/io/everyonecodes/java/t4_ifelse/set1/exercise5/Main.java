package io.everyonecodes.java.t4_ifelse.set1.exercise5;

import java.util.Scanner;

public class Main {

    static final Scanner scanner = new Scanner(System.in);

    public static boolean askIfWearingHat() {
        System.out.println("Are you wearing a hat?");
        return scanner.nextBoolean();
    }

    public static boolean askIfBringingPet() {
        System.out.println("Do you have a pet with you?");
        return scanner.nextBoolean();
    }

    public static void main(String[] args) {
        if (askIfBringingPet() || askIfWearingHat()) {
            System.out.println("You can't come in");
        }
        else {
            System.out.println("Welcome to the cinema! You can enter!");
        }
    }
}
