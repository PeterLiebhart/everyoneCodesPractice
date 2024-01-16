package io.everyonecodes.java.t4_ifelse.set1.exercise6;

import java.util.Scanner;

public class Main {

    static final Scanner scanner = new Scanner(System.in);
    public static boolean checkIfAdult() {
        System.out.println("How old are you?");
        return scanner.nextInt() >= 18;
    }

    public static boolean checkNameValidity(String name) {
        return name.length() >= 3;
    }

    public static void signUp(String name) {
        System.out.println("Name was added to the database");
    }

    public static void displayLoadingSymbol() {
        System.out.println("Loading symbol is being displayed");
    }


    public static void main(String[] args) {
        boolean isAdult = checkIfAdult();
        scanner.nextLine();
        System.out.println("Enter your name:  ");
        String name = scanner.nextLine();
        boolean hasValidName = checkNameValidity(name);
        signUp(name);
        displayLoadingSymbol();
        if (isAdult && hasValidName) {
            System.out.println("You’re signed up! Thank you.");
        }
        else System.out.println("Your age or name do not follow our policies. We apologize for the inconveniences.");

    }
}
