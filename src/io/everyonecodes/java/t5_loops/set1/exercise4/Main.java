package io.everyonecodes.java.t5_loops.set1.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> names = new ArrayList<String>(List.of("Matilda", "Derek", "Hansel"));

    public static void main(String[] args) {
        int price = 0;
        for (String name : names) {
            price += name.length();
        }
        System.out.println(price);
    }
}
