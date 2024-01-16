package io.everyonecodes.java.t2a_functions1.reflection.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length in centimeters: ");
        double centimeters = scanner.nextDouble();
        meters(centimeters);
        inches(centimeters);
        yards(centimeters);
        System.out.println("Enter a mass in kilograms: ");
        double kilograms = scanner.nextDouble();
        grams(kilograms);
        tons(kilograms);
        pounds(kilograms);
    }
    public static void meters(double centimeters) {
        double cmToMeter = centimeters / 100;
        System.out.println("meters: " + cmToMeter);
    }
    public static void inches(double centimeters) {
        double cmToInch = centimeters / 2.54;
        System.out.println("inches: " + cmToInch);
    }
    public static void yards(double centimeters) {
        double cmToYard = centimeters / 91.44;
        System.out.println("yards: " + cmToYard);
    }
    public static void grams(double kilograms) {
        double kgToGram = kilograms * 1000;
        System.out.println("grams: " + kgToGram);
    }

    public static void tons(double kilograms) {
        double kgToTon = kilograms / 1000;
        System.out.println("(metric) tons: " + kgToTon);
    }
    public static void pounds(double kilograms) {
        double kgToPound = kilograms * 2.2046;
        System.out.println("pounds: " + kgToPound);
    }

}
