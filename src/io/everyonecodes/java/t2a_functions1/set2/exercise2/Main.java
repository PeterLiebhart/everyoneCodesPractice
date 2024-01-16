package io.everyonecodes.java.t2a_functions1.set2.exercise2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        collectData();
    }
    public static void collectData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you owe? > ");
        double owed = scanner.nextDouble();
        System.out.println("How much do you spend each week? > ");
        double weeklyExpenses = scanner.nextDouble();
        System.out.println("How much income do you have each month? > ");
        double income = scanner.nextDouble();
        calculateDebt(owed, weeklyExpenses, income);
    }
    public static void calculateDebt(double owed, double weeklyExpenses, double income) {
        double result = owed / (income - weeklyExpenses * 4);
        System.out.println(result);
    }
}
