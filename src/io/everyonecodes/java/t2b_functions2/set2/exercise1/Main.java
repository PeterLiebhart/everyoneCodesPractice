package io.everyonecodes.java.t2b_functions2.set2.exercise1;

public class Main {
    public static void main (String[] args) {
        System.out.println(calculateTaxiCost(20));
        System.out.println(calculateTaxiCost(40));
        System.out.println(calculateTaxiCost(50));
    }
    public static String calculateTaxiCost(double numberOfMinutes) {
        double durationCost = numberOfMinutes * 1.15;
        double cost = 2.5 + durationCost;
        return "The total cost is " + cost;
    }
}

