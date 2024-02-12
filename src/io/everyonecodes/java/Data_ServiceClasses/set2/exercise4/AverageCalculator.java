package io.everyonecodes.java.Data_ServiceClasses.set2.exercise4;

import java.util.List;

public class AverageCalculator {

    public static double calculateAverage(List<Integer> integerList) {
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        return sum / integerList.size();
    }
}
