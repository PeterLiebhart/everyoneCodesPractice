package io.everyonecodes.java.t5_loops.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static boolean containsCharacter(String word, char letter) {
        for (char character : word.toCharArray()) {
            if (letter == character) {
                return true;
            }
        }
        return false;
    }

    public static int countDistinctVowels(String word) {
        List<Character> vowels = new ArrayList<Character>(List.of('a', 'e', 'i', 'o', 'u'));

        int count = 0;
        for (Character vowel : vowels) {
            if (containsCharacter(word, vowel)) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("What is your word? ");
            String word = scanner.nextLine();
            System.out.println(word + " contains " + countDistinctVowels(word) + " distinct vowels!");
        }
    }
}
