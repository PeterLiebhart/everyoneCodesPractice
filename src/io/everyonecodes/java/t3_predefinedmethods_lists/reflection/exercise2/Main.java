package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of());
        for (int i = 1; i < 6; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.remove(2);
        numbers.remove(2);
        System.out.println(numbers);
        addToMiddleOfList(numbers, 4);
        addToMiddleOfList(numbers, 3);

        System.out.println(numbers);
    }
    public static void addToMiddleOfList(List<Integer> listOfInteger, int numberToAdd) {
        if (listOfInteger.size() % 2 == 0) {
            int middleOfList = (int)Math.ceil(listOfInteger.size() / 2.0);
            listOfInteger.add(middleOfList, numberToAdd);

        }

        else {
            double middleOfList = listOfInteger.size() / 2.0;
            listOfInteger.add((int)middleOfList + 1, numberToAdd);
    }
    }

}
