package io.everyonecodes.java.t5_loops.set1.exercise3;

import java.util.List;

public class Main {

    public static List<Integer> getMoneyNumbersFromHanselsFriends() {
//    Let's pretend Hansel has 5 friends where each one is more generous than the next...
        return List.of(1, 2, 3, 4, 5);
    }

    static List<Integer> money = getMoneyNumbersFromHanselsFriends();


    public static void main(String[] args) {
        int sum = 0;
        for (int amount : money) {
            sum += amount;
        }
        System.out.println(sum);
    }
}
