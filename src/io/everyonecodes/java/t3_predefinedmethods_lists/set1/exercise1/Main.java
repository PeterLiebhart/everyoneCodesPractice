package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        double splitBillAmountWithTip = Math.ceil(13.40 * 1.1 / 2);
        System.out.println(splitBillAmountWithTip);
        System.out.println(Math.ceil(calculateRoundedSplitAmount(13.40, 2, 10)));
    }
    public static double calculateRoundedSplitAmount(double total, int numberOfPeople, double tipPercentage){
        return total * (1 + tipPercentage / 100) / numberOfPeople;
    }
}
