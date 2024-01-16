package io.everyonecodes.java.testing.oneToHundred.myIdea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main  {

    static List<Integer> numbers = new ArrayList<Integer>(List.of());

    public static List<Integer> addNumbersAndRemoveOne(List<Integer> numbers) {
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        numbers.remove(10);
        return numbers;
    }
    public static void findMissingNumber(List<Integer> newNumbers) {
        for (Integer num : newNumbers) {
            int numberPlusOne = num + 1;
            if (newNumbers.getFirst() != 1) {
                System.out.println("The missing number is 1!");
                break;
            } else if (!newNumbers.contains(numberPlusOne)) {
                System.out.println("The missing number is: " + (num + 1) + "!");
                break;
            }
        }

    }

    public static void main(String[] args) {
        List<Integer> newNumbers = addNumbersAndRemoveOne(numbers);
        findMissingNumber(newNumbers);
        System.out.println(newNumbers);
    }
}

