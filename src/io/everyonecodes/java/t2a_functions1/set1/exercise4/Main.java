package io.everyonecodes.java.t2a_functions1.set1.exercise4;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        calculateTaxiCost();
    }
    public static void calculateTaxiCost() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long was the ride in minutes? > ");
        double duration = scanner.nextDouble();
        double durationCost = duration * 1.15;
        double cost = 2.5 + durationCost;
        System.out.println("The total cost is " + cost);
    }
}
