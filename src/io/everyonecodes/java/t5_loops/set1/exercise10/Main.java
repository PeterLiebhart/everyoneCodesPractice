package io.everyonecodes.java.t5_loops.set1.exercise10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> getSomeWords(){
        return List.of("gallery", "conviction", "performance", "diameter", "conservative", "constellation", "communication", "incentive");
    }

    static List<String> fullWords = getSomeWords();
    static List<String> nickNames = new ArrayList<>(List.of());

    public static void main(String[] args) {
        for (String words : fullWords) {
            nickNames.add(words.substring(0, words.length() / 2));
        }
        System.out.println(nickNames);
    }
}
