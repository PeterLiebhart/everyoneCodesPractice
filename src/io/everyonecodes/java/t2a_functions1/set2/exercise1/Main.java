package io.everyonecodes.java.t2a_functions1.set2.exercise1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        calculateTaxiCost(20);
        calculateTaxiCost(40);
        calculateTaxiCost(50);
    }
    public static void calculateTaxiCost(double numberOfMinutes) {
        double durationCost = numberOfMinutes * 1.15;
        double cost = 2.5 + durationCost;
        System.out.println("The total cost is " + cost);
    }
}
