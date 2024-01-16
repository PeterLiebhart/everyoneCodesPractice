package io.everyonecodes.java.t2b_functions2.set2.exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double total = 0;
        double totalAverage = 0;
        for (String weekDay : weekDays) {
            System.out.println("How many grams of rice did you eat on " + weekDay + "? > ");
            double answer = scanner.nextDouble();
            total += answer;
        }
        totalAverage = total / 7;
        System.out.println(calculateGrains(totalAverage));
    }
    public static String calculateGrains(double average) {
        double grains = average * 50 * 365.25 * 85;
        return "You will eat a total of " + (int)grains + " grains of rice in your life!";
    }
}
