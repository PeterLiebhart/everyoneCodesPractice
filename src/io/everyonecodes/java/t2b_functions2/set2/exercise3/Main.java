package io.everyonecodes.java.t2b_functions2.set2.exercise3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println(bookBusTicket(askForName(), askForTicketNumber()));
        System.out.println(bookBusTicket(askForName(), askForTicketNumber()));
        System.out.println(bookBusTicket(askForName(), askForTicketNumber()));
    }
    public static String askForName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? > ");
        return scanner.nextLine();
    }
    public static int askForTicketNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What bus seat do you want?");
        return scanner.nextInt();
    }

    public static String bookBusTicket(String name, double ticketNumber) {
        return "Okay, attempting to book bus ticket! ...\nBus ticket successfully booked for " + name + "! Your seat number is " + ticketNumber + "!";
    }}