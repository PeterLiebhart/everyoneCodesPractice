package io.everyonecodes.java.t2a_functions1.set2.exercise3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        buyBusTicket();
        buyBusTicket();
        buyBusTicket();
    }
    public static void buyBusTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? > ");
        String name = scanner.nextLine();
        System.out.println("What bus seat do you want?");
        double ticketNumber = scanner.nextDouble();
        bookBusTicket(name, ticketNumber);
    }
    public static void bookBusTicket(String name, double ticketNumber) {
        System.out.println("Okay, attempting to book bus ticket! ...");
        System.out.println("Bus ticket successfully booked for " + name + "! Your seat number is " + ticketNumber);
    }
}
