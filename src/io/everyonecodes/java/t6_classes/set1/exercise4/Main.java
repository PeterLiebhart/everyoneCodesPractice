package io.everyonecodes.java.t6_classes.set1.exercise4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What color does your car have?");
        String color = scanner.nextLine();
        System.out.println("What year was your car built?");
        int yearBuilt = scanner.nextInt();
        Car car = new Car(color, yearBuilt);
        Car alsoACar = new Car("red", 2000);
    }
}
