package io.everyonecodes.java.t1_variables.set1.exercise4;


import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //a
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me your first number to add: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Tell me your second number to add: ");
        double secondNumber = scanner.nextDouble();
        double sum = firstNumber + secondNumber;
        System.out.println("The sum of the two numbers is: " + sum);
        //b
        System.out.println("Tell me your first number to multiply: ");
        double firstMultiplyNumber = scanner.nextDouble();
        System.out.println("Tell me your second number to multiply: ");
        double secondMultiplyNumber = scanner.nextDouble();
        System.out.println("Tell me your third number to multiply: ");
        double thirdMultiplyNumber = scanner.nextDouble();
        double multiplyResult = firstMultiplyNumber * secondMultiplyNumber * thirdMultiplyNumber;
        System.out.println("The result when you multiply all 3 numbers is: " + multiplyResult);

    }
}
