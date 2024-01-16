package io.everyonecodes.java.t6_classes.set1.exercise6;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String name = "Peter";
        int timeNeededInMinutes = 30;
        List<String> ingredients = List.of("eggs", "milk", "flour");
        List<String> instructions = List.of("mix", "bake", "eat");

        Recipe recipe = new Recipe(name, timeNeededInMinutes, ingredients, instructions);
    }
}
