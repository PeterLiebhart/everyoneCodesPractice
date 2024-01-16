package io.everyonecodes.java.t2a_functions1.set2.exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String advertisement = scanner.nextLine();
        perfectCondition(advertisement);
        top(advertisement);
        both(advertisement);
    }
    public static void perfectCondition(String advertisement) {
        System.out.println(advertisement.concat(" - Perfect Condition!!!!"));
    }
    public static void top(String advertisement) {
        String topVar = "TOP - ";
        System.out.println(topVar.concat(advertisement));
    }
    public static void both(String advertisement) {
        String topVar = "TOP - ";
        String bothVar = topVar.concat(advertisement).concat(" - Perfect Condition!!!!");
        System.out.println(bothVar);
    }
}


