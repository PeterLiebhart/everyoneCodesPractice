package io.everyonecodes.java.Data_ServiceClasses.set2.exercise4;

public class DistanceCalculator {

    public static double calculateDistanceInKm(int steps) {
        double kmPerStep = 0.000762;
        return steps * kmPerStep;
    }
}
