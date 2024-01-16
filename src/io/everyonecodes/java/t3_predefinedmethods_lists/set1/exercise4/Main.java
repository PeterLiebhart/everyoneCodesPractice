package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise4;

public class Main {
    public static void main(String[] args) {
        String magazineTitle1 = "The beauty and the beast";
        String magazineTitle2 = "Gardening is a great thing";
        String magazineTitle3 = "The ‘Diodes for Everyone’ robo-political party loses participation";
        String magazineTitle4 = "The most impressive concert of all time";

        String piece1 = magazineTitle1.substring(0, 3);
        String piece2 = magazineTitle3.substring(26, 30);
        String piece3 = magazineTitle1.substring(4, 10);
        String piece4 = magazineTitle2.substring(10, 26);
        String piece5 = magazineTitle3.substring(12, 15);
        String piece6 = magazineTitle3.substring(41, 46);
        String piece7 = magazineTitle4.substring(35,39);

        String designTitle = piece1 + " " + piece2 + " " + piece3 + " " + piece4 + " " + piece5 + " " + piece6 + " " + piece7;
        System.out.println("John’s design title: " + designTitle);
    }


}
