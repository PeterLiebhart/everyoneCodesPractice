package io.everyonecodes.java.t7_consolidation.set1.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static int countTrueValues(List<Boolean> booleans) {
        int count = 0;
        for (Boolean bool : booleans) {
            if (bool) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Boolean> booleans = new ArrayList<>(List.of(true, true, false, true));
        System.out.println(countTrueValues(booleans));
    }
}
