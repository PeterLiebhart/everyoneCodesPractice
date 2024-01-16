package io.everyonecodes.java.t1_variables.set1.exercise6;

public class Main {
    public static void main (String[] args) {
        double distance = 200.1;
        double travelTimeBus = distance / 90.0;
        double travelTimeCar = distance / 110.0;
        double difference = travelTimeBus - travelTimeCar;
        System.out.println("The travel time by bus is " + travelTimeBus + " hours");
        System.out.println("The travel time by car is " + travelTimeCar + " hours");
        System.out.println("The difference between the two is " + difference + " hours.");
    }
}
