package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise5;

public class Main {
    public static String makeLastCapital(String word) {
        if (word.length() < 2) {
            return word;
        }
        return word.substring(0, word.length() - 1) + word.substring(word.length() - 1).toUpperCase();
    }

    public static void main(String[] args) {
        String originalPintEger = "pint-eger";
        String originalGUINness = "GUI-nness";
        String originalCyberCider = "cyber-cider";

        String correctedPintEger = makeLastCapital(originalPintEger);
        String correctedGUINness = makeLastCapital(originalGUINness);
        String correctedCyberCider = makeLastCapital(originalCyberCider);

        System.out.println("Original: " + originalPintEger + ", Corrected: " + correctedPintEger);
        System.out.println("Original: " + originalGUINness + ", Corrected: " + correctedGUINness);
        System.out.println("Original: " + originalCyberCider + ", Corrected: " + correctedCyberCider);
    }
}



