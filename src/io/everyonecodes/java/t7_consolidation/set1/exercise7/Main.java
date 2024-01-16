package io.everyonecodes.java.t7_consolidation.set1.exercise7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        for (int i = 0; i < max; i++) {
            System.out.println("*".repeat(i));
        }
        for (int i = max; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
    }
}
