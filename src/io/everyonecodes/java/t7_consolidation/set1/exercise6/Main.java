package io.everyonecodes.java.t7_consolidation.set1.exercise6;

import java.util.Scanner;

public class Main {

    public static double add(double left, double right) {
        return left + right;
    }

    public static double substract(double left, double right) {
        return left - right;
    }

    public static double multiply(double left, double right) {
        return left * right;
    }

    public static double divide(double left, double right) {
        return left / right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation");
        String operation = scanner.nextLine();
        System.out.println("Enter left side");
        double left = scanner.nextInt();
        System.out.println("Enter right side");
        double right = scanner.nextInt();

        switch (operation) {
            case "add":
                System.out.println(add(left, right));
                break;
            case "substract":
                System.out.println(substract(left, right));
                break;
            case "divide":
                System.out.println(divide(left, right));
                break;
            case "multiply":
                System.out.println(multiply(left, right));
                break;
            case "stop":
                break;
        }

    }
}
