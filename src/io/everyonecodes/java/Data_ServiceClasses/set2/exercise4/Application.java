package io.everyonecodes.java.Data_ServiceClasses.set2.exercise4;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Integer> stepList = StepCollector.collect();

        int sumOfSteps = 0;
        for (Integer steps : stepList) {
            sumOfSteps += steps;
        }

        int numberOfPeople = 3;
        double averageSteps = AverageCalculator.calculateAverage(stepList);
        double averageDistance = DistanceCalculator.calculateDistanceInKm(sumOfSteps) / numberOfPeople;

        System.out.println("Average steps : " + averageSteps + "\nAverage distance: " + averageDistance);
    }
}
