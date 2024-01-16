package io.everyonecodes.java.t4_ifelse.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static List<String>friendsNames = new ArrayList<String>(List.of("Hansel", "Matilda"));

    public static boolean isAtHome() {
        System.out.println("Are we at home?");
        return scanner.nextBoolean();
    }

    public static void greetSomeone() {
        boolean isAtHome = isAtHome();
        scanner.nextLine();

        System.out.println("Woof is this persons name? ");
        String name = scanner.nextLine();

        if (isAtHome || friendsNames.contains(name)) {
            System.out.println("Hi there, " + name);
        }
    }

    public static void main(String[] args) {
        greetSomeone();
    }
}
