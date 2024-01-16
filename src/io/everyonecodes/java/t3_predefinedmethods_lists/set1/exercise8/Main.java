package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cups = new ArrayList<>(List.of("empty cup", "empty cup", "cup with ball"));
        String cupWithBall = cups.get(2);

        cups.remove(2);
        cups.add(1, cupWithBall);
        System.out.println(cups);
        cups.remove(1);
        cups.add(2, cupWithBall);
        System.out.println(cups);
        cups.remove(2);
        cups.add(0,cupWithBall);
        System.out.println(cups);
    }
}