package io.everyonecodes.java.t1_variables.set1.exercise5;

import java.util.Scanner;

public class Main {
    static public void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the celsius value: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32.0;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
