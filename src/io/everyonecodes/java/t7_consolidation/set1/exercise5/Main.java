package io.everyonecodes.java.t7_consolidation.set1.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> removeOutliers(List<Integer> integerList) {
        if (integerList == null || integerList.size() < 3) {
            return integerList;
        }

        int largest = integerList.get(0);
        int smallest = integerList.get(0);
        for (int num : integerList) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        integerList.remove(Integer.valueOf(largest));
        integerList.remove(Integer.valueOf(smallest));
        return integerList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,1, 2, 3, 4, 5, 6, 7, 8, 9,9));
        System.out.println(removeOutliers(list));
    }
}
