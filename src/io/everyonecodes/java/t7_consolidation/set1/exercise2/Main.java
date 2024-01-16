package io.everyonecodes.java.t7_consolidation.set1.exercise2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What should I do with the numbers from 1 to " + number + "?");
        String command = scanner.nextLine();
        int result = 1;
        if (command.equals("add")){
            for (int i = 1; i <= number; i++) {
                result += i;
            }
            System.out.println("The result of all the whole numbers from 1 to " + number + " added is " + (result - 1));
        }
        else if (command.equals("multiply")) {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println("The result of all whole numbers from 1 to " + number + " multiplied is " + result);
        }
        else {
            System.out.println("I don't understand that command");
        }
    }
}
