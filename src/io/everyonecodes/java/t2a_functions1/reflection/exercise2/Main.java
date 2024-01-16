package io.everyonecodes.java.t2a_functions1.reflection.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Please enter the last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Please enter the year of birth: ");
        String birthYear = scanner.nextLine();
        System.out.println("Please enter the title: ");
        String title = scanner.nextLine();
        wordSalad(firstName, lastName, birthYear, title);
    }
    public static void wordSalad(String firstName, String lastName, String birthYear, String title) {
        System.out.println("Different ways to display the name: ");
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName + " " + lastName + ", " + title);
        System.out.println(title + " " + lastName + ", " + firstName);
        System.out.println(title + " " + firstName + " " + lastName);
        System.out.println(title + " " + firstName + " " + lastName + ", born " + birthYear);
    }
}
