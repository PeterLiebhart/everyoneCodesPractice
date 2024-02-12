package io.everyonecodes.java.Data_ServiceClasses.set2.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepCollector {

    private static int askForSteps(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many steps did you count, " + name + "?");
        return scanner.nextInt();
    }

    public static List<Integer> collect() {
        List<Integer> stepList = new ArrayList<>(List.of());
        stepList.add(askForSteps("Matilda"));
        stepList.add(askForSteps("Hansel"));
        stepList.add(askForSteps("Derek"));
        return stepList;
    }

}
