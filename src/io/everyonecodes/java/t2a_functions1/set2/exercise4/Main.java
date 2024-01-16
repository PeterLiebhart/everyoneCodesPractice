package io.everyonecodes.java.t2a_functions1.set2.exercise4;

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
        calculateGrains(totalAverage);
    }
    public static void calculateGrains(double average) {
        double grains = average * 50 * 365.25 * 85;
        System.out.println("You will eat a total of " + (int)grains + " grains in your life!");
    }

}
