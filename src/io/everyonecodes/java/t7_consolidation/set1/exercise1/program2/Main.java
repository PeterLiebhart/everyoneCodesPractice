package io.everyonecodes.java.t7_consolidation.set1.exercise1.program2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter numbers, one per line. Enter \"stop\" to stop.");
        List<Integer> numbers = new ArrayList<>();
        int biggestNumber = Integer.MIN_VALUE;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            int inputNumber = Integer.parseInt(input);
            numbers.add(inputNumber);
        }

        for (Integer number : numbers) {
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        System.out.println(biggestNumber);
    }
}