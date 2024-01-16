package io.everyonecodes.java.t2b_functions2.set1.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the total rent: >  ");
    double totalRent = scanner.nextDouble();
    double individualRent = splitRent(totalRent, 4) ;
    String name1 = "Toby";
    String name2 = "Sarah";
    String name3 = "Gregg";
    String name4 = "Albus";
    payRent(name1, individualRent);
    payRent(name2, individualRent);
    payRent(name3, individualRent);
    payRent(name4, individualRent);
    }
    public static double splitRent(double rent, int amountOfRenters) {

        return rent / amountOfRenters;
    }
    public static String askPersonForIBAN(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", enter your IBAN: >  ");
        return scanner.nextLine();
    }
    public static void payRent(String name, Double individualRentAmount) {
        askPersonForIBAN(name);
        transferMoney("something", 3);
        System.out.println("Your payment of " + individualRentAmount + " was succesfully processed!");

    }
    public static void transferMoney(String iban, double amount) {

        System.out.println("Transfer successful. ");
    }

}
