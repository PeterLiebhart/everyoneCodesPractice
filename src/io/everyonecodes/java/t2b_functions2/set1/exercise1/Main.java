package io.everyonecodes.java.t2b_functions2.set1.exercise1;

public class Main {
    public static void main(String[] args) {
       double totalTime = calculateTotalTime(5, 2.5, 1.2);
       int numberOfStations = 5;
       double walkingDistanceTramStation = 2.5;
       double walkingDistanceFriendsHouse = 1.2;
       System.out.println(totalTime);
       double variableTotalTime = calculateTotalTime(numberOfStations, walkingDistanceTramStation, walkingDistanceFriendsHouse);
        System.out.println(variableTotalTime);

    }
    public static double calculateWalkingTime(double walkingDistance) {
        double walkingSpeed = 15;
        return walkingDistance * walkingSpeed;
    }
    public static double calculateTramTime(int numberOfStations) {
        double timePerStation = 4;
        return numberOfStations * timePerStation;
    }
    public static double calculateTotalTime(int numberOfStations, double walkingDistanceTramStation, double walkingDistanceFriendsHouse ) {
        double walkingTimeToFriendsHouse = calculateWalkingTime(walkingDistanceFriendsHouse);
        double walkingTimeToTramStation = calculateWalkingTime(walkingDistanceTramStation);
        double tramTime = calculateTramTime(numberOfStations);
        return walkingTimeToFriendsHouse + walkingTimeToTramStation + tramTime;
    }
}
