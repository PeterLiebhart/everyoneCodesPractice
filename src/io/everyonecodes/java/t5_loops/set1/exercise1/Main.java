package io.everyonecodes.java.t5_loops.set1.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static  List<String> groceries = new ArrayList(List.of("bread", "butter", "milk", "cheese", "yoghurt"));

    public static void main(String[] args) {
        for (String item : groceries) {
            System.out.println("I need " + item);
        }
    }
}
