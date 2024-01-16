package io.everyonecodes.java.t2b_functions2.set2.exercise2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you owe? > ");
        double owed = scanner.nextDouble();
        System.out.println("How much do you spend each week? > ");
        double weeklyExpenses = scanner.nextDouble();
        System.out.println("How much income do you have each month? > ");
        double income = scanner.nextDouble();
        System.out.println(calculateDebt(owed, weeklyExpenses, income));
    }

    public static double calculateDebt(double owed, double weeklyExpenses, double income) {
        return owed / (income - weeklyExpenses * 4);
    }
}
