package io.everyonecodes.java.t4_ifelse.reflection.exercise3;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static boolean isAdult() {
        System.out.println("How old are you?");
        return scanner.nextInt() >= 18;
    }

    public static boolean isWearingHat() {
        System.out.println("Are you wearing a hat?");
        return scanner.nextBoolean();
    }

    public static boolean knowsSecretPassword() {
        scanner.nextLine();
        System.out.println("What is the secret password?");
        return scanner.nextLine().equals("Hokopoko");
    }

    public static void main(String[] args) {
        if (isAdult() && isWearingHat() && knowsSecretPassword()) {
            System.out.println("You can enter our club!");
        }
        else System.out.println("I'm sorry, but you cannot enter our club.");
    }
}
