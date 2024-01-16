package io.everyonecodes.java.t2a_functions1.set1.exercise3;

public class Main {
    public static void main (String[] args) {
        takeDrivingTest();
    }
    public static void checkIfEverythingIsThere() {
        System.out.println("checkIfEverythingIsThere");
    }
    public static void putKeyInIgnition() {
        System.out.println("putKeyInIgnition");
    }
    public static void getOutOfParkingSpot() {
        System.out.println("getOutOfParkingSpot");
    }
    public static void prepareCarForDriving() {
        checkIfEverythingIsThere();
        putKeyInIgnition();
        getOutOfParkingSpot();
    }
    public static void flirtWithInstructor() {
        System.out.println("flirtWithInstructor");
    }
    public static void pray() {
        System.out.println("pray");
    }
    public static void tryToRememberWhatYouLearned() {
        System.out.println("tryToRememberWhatYouLearned");
    }
    public static void failMiserably() {
        System.out.println("failMiserably");
    }
    public static void takeDrivingTest() {
        prepareCarForDriving();
        flirtWithInstructor();
        pray();
        tryToRememberWhatYouLearned();
        failMiserably();
    }
}
