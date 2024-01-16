package io.everyonecodes.java.t4_ifelse.set1.exercise1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    static HashMap<String, String> commentMap = new HashMap<String, String>();

    public static void askFavoriteColor() {
        System.out.println("What is your favorite color?");
        String favoriteColor = scanner.nextLine();

        if (favoriteColor.equals("blue")) {
            System.out.println(commentMap.get("exaltedComment"));
        }
        else {
            System.out.println(commentMap.get("moderateComment"));
        }
    }

    public static void askIfLivingRoomWillBeBlue() {
        System.out.println("Would you like to paint the living room in blue sky color?");
        boolean isWantingBlueLivingRoom = scanner.nextBoolean();
        scanner.nextLine();

        if (isWantingBlueLivingRoom) {
            System.out.println(commentMap.get("exaltedComment"));
        }
        else {
            System.out.println(commentMap.get("moderateComment"));
        }
    }

    public static int askForBudget() {
        System.out.println("What is your budget for the decorations in Euro?");
        int budget = scanner.nextInt();

        if (budget < 5000) {
            System.out.println(commentMap.get("disappointedComment"));
        }
        else if (budget > 15000) {
            System.out.println(commentMap.get("exaltedComment"));
        }
        else {
            System.out.println(commentMap.get("moderateComment"));
        }
        return budget;
    }

    public static void askAboutTimeAndBudget() {
        System.out.println("How many days will the decorations take?");
        int days = scanner.nextInt();

        if (days < 7 && askForBudget() > 12000) {
            System.out.println(commentMap.get("exaltedComment"));
        }
        else {
            System.out.println(commentMap.get("moderateComment"));
        }
    }

    public static void main(String[] args) {

        commentMap.put("disappointedComment", "Oh, I didn’t expect something like that...");
        commentMap.put("moderateComment", "That’s quite interesting.");
        commentMap.put("exaltedComment", "I think just the same!");

        askFavoriteColor();
        askIfLivingRoomWillBeBlue();
        askForBudget();
        askAboutTimeAndBudget();
    }
}

