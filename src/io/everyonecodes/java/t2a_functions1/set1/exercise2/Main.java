package io.everyonecodes.java.t2a_functions1.set1.exercise2;

public class Main {
    public static void main (String[] args) {
        buildHouse();
    }
    public static void measure() {
        System.out.println("measure");
    }
    public static void findOutWhatWeNeed() {
        System.out.println("findOutWhatWeNeed");
    }
    public static void driveToShop() {
        System.out.println("driveToShop");
    }
    public static void buyMaterials() {
        System.out.println("buyMaterials");
    }
    public static void getMaterials() {
        findOutWhatWeNeed();
        driveToShop();
        buyMaterials();
    }
    public static void talkToTeam() {
        System.out.println("talkToTeam");
    }
    public static void dig() {
        System.out.println("dig");
    }
    public static void layWires() {
        System.out.println("layWires");
    }
    public static void placeWalls() {
        System.out.println("placeWalls");
    }
    public static void assembleHouse() {
        dig();
        layWires();
        placeWalls();
    }
    public static void collectPaycheck() {
        System.out.println("collectPaycheck");
    }
    public static void buildHouse() {
        measure();
        getMaterials();
        talkToTeam();
        assembleHouse();
        collectPaycheck();
    }
}
