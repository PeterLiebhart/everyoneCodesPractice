package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> bingoBalls = getBingoNumbersShuffled();
        System.out.println("And the next number is: " + bingoBalls.remove(0));
    }
    public static List<Integer> getBingoNumbersShuffled() {
        // Creates a list from 1 to 75 and shuffles it
        java.util.List<Integer> numbers = java.util.stream.Stream.iterate(1, n -> n + 1)
                .limit(75)
                .collect(java.util.stream.Collectors.toList());
        java.util.Collections.shuffle(numbers);
        return numbers;
    }
}
