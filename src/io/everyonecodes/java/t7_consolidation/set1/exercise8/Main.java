package io.everyonecodes.java.t7_consolidation.set1.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int countAboveAverage(List<Double> doubleList) {
        double sum = 0;
        for (Double num : doubleList) {
            sum += num;
        }
        double average = sum / doubleList.size();
        int count = 0;
        for (Double num : doubleList) {
            if(num > average) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countAboveAverage(new ArrayList<Double>(List.of(1.0,5.8, 1.0, 1.0, 2.5, 1.0, 1.0))));

    }
}
