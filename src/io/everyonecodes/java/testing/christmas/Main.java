package io.everyonecodes.java.testing.christmas;

import io.everyonecodes.java.testing.random.Person;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How big is your tree?");
        int treeSize = scanner.nextInt();
        for (int i = 0; i < treeSize; i++) {
            System.out.println(" ".repeat(treeSize - i) + "*".repeat(i * 2 + 1));
        }
    }
}
