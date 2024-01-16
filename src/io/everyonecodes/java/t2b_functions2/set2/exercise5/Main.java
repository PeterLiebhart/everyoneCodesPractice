package io.everyonecodes.java.t2b_functions2.set2.exercise5;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String advertisement = scanner.nextLine();
        System.out.println(perfectCondition(advertisement));
        System.out.println(top(advertisement));
        System.out.println(both(advertisement));
    }
    public static String perfectCondition(String advertisement) {
        return advertisement.concat(" - Perfect Condition!!!!");
    }
    public static String top (String advertisement) {
        String topVar = "TOP - ";
        return topVar.concat(advertisement);
    }
    public static String both (String advertisement) {
        String topVar = "TOP - ";
        return topVar.concat(advertisement).concat(" - Perfect Condition!!!!");
    }
}
