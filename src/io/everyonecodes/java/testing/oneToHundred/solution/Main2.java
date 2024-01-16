package io.everyonecodes.java.testing.oneToHundred.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Main2 {

    static List<Integer> numbers = new ArrayList<Integer>(List.of());

    public static List<Integer> addNumbersAndRemoveOne(List<Integer> numbers) {
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        numbers.remove(10);
        return numbers;
    }

    public static void calculateMissingNumber(List<Integer> newNumbers) {
        int sum = 0;
        for (Integer num : newNumbers) {
            sum += num;
        }
        System.out.println(5050 - sum);
    }

    public static void main(String[] args) {
    calculateMissingNumber(addNumbersAndRemoveOne(numbers));
    }
}

