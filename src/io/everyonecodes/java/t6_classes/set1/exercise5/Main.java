package io.everyonecodes.java.t6_classes.set1.exercise5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What brand does your phone have?");
        String brand = scanner.nextLine();
        System.out.println("Has your phone been turned off and on again?");
        boolean hasBeenTurnedOffAndOnAgain = scanner.nextBoolean();
        Phone phone = new Phone(brand, hasBeenTurnedOffAndOnAgain);

    }
}
