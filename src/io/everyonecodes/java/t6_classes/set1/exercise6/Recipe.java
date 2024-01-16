package io.everyonecodes.java.t6_classes.set1.exercise6;

import java.util.List;

public class Recipe {

    String name;
    int timeNeededInMinutes;
    List<String> ingredients;
    List<String> instructions;

    public Recipe(String name, int timeNeededInMinutes, List<String> ingredients, List<String> instructions) {
        this.name = name;
        this.timeNeededInMinutes = timeNeededInMinutes;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
}
