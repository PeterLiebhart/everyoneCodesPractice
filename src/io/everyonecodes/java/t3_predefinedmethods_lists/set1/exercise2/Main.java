package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise2;

public class Main {
    public static void main(String[] args) {
        String[] movieTitles = {"the matrix", "inception", "the grand budapest hotel"};
        for (String title : movieTitles) {
            System.out.println(makeFirstCapital(title));
        }
    }
    public static String makeFirstCapital(String string) {
        String[] words = string.split(" ");
        String result = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
        }
        return result;
    }
}