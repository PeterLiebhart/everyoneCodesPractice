package io.everyonecodes.java.t5_loops.set1.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> weekDays = new ArrayList<String>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

    public static boolean containsCharacter(String weekDay, char letter) {
        for (char character : weekDay.toCharArray()) {
            if (letter == character) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        for (String day : weekDays) {
            if (containsCharacter(day, 'n')) {
                System.out.println("On " + day + ", the man will shout!");
            }
        }
    }
}


