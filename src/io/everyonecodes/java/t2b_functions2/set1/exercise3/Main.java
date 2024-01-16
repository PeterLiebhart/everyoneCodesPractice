package io.everyonecodes.java.t2b_functions2.set1.exercise3;

public class Main {
    public static void main(String[] args) {
        double hairGrowthPerMonthInInches = 0.5;
        double hairLengthForMenInCm = 10;
        double hairLengthForWomenInCm = 15;
        double hairAmount = 100000;
        double idealHairLengthInM = 0.5; totalHairGrowthPerMonthForAllHair(hairGrowthPerMonthInInches, hairAmount);
        String first = totalHairGrowthPerMonthForAllHair(hairGrowthPerMonthInInches, hairAmount);
        String second = totalLengthOfHairCombined(hairLengthForMenInCm, hairLengthForWomenInCm);
        String third = howManyMonthsForHairGrowth(hairGrowthPerMonthInInches, idealHairLengthInM);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
    public static double inchToCM(double inch) {
        return inch * 2.54;
    }
    public static double cmToM(double cm) {
        return cm / 100;
    }
    public static double mToKM(double m) {
        return m / 1000;
    }
    public static String totalHairGrowthPerMonthForAllHair(double HairGrowthPerMonthInInches, double hairAmount) {
        return "The total hair growth per month is " + HairGrowthPerMonthInInches * hairAmount + " inches or " + inchToCM(HairGrowthPerMonthInInches) + "km";
    }
    public static String totalLengthOfHairCombined(double hairLengthForMenInCm, double hairLengthForWomenInCm) {
        double hairLengthMenKM = hairLengthForMenInCm / 100000;
        double hairLengthWomenKM = hairLengthForWomenInCm / 100000;
        return "Total length of hair for men: " + hairLengthMenKM * 100000  + "km, and for women: "+ hairLengthWomenKM * 100000 + "km.";
    }
    public static String howManyMonthsForHairGrowth(double hairGrowthPerMonthInInches, double idealHairLengthInM) {
        double hairGrowthPerMonthInCM = inchToCM(hairGrowthPerMonthInInches);
        return "You'll need " + idealHairLengthInM / hairGrowthPerMonthInCM * 100 + "months to grow your hair to " + idealHairLengthInM + "m";
    }
}
