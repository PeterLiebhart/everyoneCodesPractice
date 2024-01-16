package io.everyonecodes.java.t2a_functions1.set1.exercise5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        calculateDebt();
    }
    public static void calculateDebt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you owe? > ");
        double owed = scanner.nextDouble();
        System.out.println("How much do you spend each week? > ");
        double weeklyExpenses = scanner.nextDouble();
        System.out.println("How much income do you have each month? > ");
        double income = scanner.nextDouble();
        System.out.println(owed / (income - weeklyExpenses * 4));
    }

}
