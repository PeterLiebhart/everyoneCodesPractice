package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> originalWords = new ArrayList<>(List.of("reward", "cable", "Samantha", "SpaceX", "upperCase", "aLEKs"));
        List<String> modifiedWords = new ArrayList<>(List.of());
        for (String originalWord : originalWords) {
            modifiedWords.add(formatToBracketsCI(originalWord));
        }
        System.out.println(modifiedWords);
    }
    public static String makeFirstCapital(String originalWord) {
        return originalWord.substring(0, 1).toUpperCase() + originalWord.substring(1);
    }

    public static String makeLastCapital(String originalWord) {
        originalWord = originalWord.toLowerCase();
        int length = originalWord.length();
        return originalWord.substring(0, length - 1) + Character.toUpperCase(originalWord.charAt(length - 1));
    }

    public static String formatToBracketsCI(String originalWord) {
        return makeFirstCapital(makeLastCapital(originalWord));
    }
}
