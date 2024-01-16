package io.everyonecodes.java.t1_variables.set1.exercise9;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?  >  ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your name? >  ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!" + "You are " + age + " " + "years old!");
    }
}
