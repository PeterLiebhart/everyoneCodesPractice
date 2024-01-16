package io.everyonecodes.java.t4_ifelse.set1.exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> ingredientsOfMostFamousCake = new ArrayList<String>(getIngredientsOfMostFamousCake());
    static final Scanner scanner = new Scanner(System.in);
    public static boolean lookForIngredient(List<String> listOfIngredients) {
        System.out.println("What particular ingredient are you looking for?  : ");
        String desiredIngredient = scanner.nextLine();
        return listOfIngredients.contains(desiredIngredient);
    }

    public static List<String> getIngredientsOfMostFamousCake() {
        return List.of("Custard", "Chocolate", "Strawberries", "Cream");
    }

    public static void main(String[] args) {
        if (lookForIngredient(ingredientsOfMostFamousCake)) {
            System.out.println("That ingredient is indeed included in the cake.");
        }
        else System.out.println("That ingredient is not included in the cake.");
    }
}
