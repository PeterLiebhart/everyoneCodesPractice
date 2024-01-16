package io.everyonecodes.java.t1_variables.set1.exercise3;

public class Main {
    public static void main (String[] args) {
        double amountOfPlants = 13.0;
        double leftoverFertilizer = 1.0;
        double amountOfFertilizer = amountOfPlants / 4;
        double amountOfFertilizerToBuyInKg = amountOfFertilizer - leftoverFertilizer;
        System.out.println("You will need to buy " + amountOfFertilizerToBuyInKg + "kg of ferticlizer!");
        double price = (amountOfFertilizerToBuyInKg * 20);
        double twentyPercentOff = price * 0.8;
        System.out.println("It will cost " + twentyPercentOff + "Euros!");
    }
}
