package io.everyonecodes.java.t7_consolidation.set1.exercise1.program1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber);
        } else {
            System.out.println(thirdNumber);
        }
    }
}
