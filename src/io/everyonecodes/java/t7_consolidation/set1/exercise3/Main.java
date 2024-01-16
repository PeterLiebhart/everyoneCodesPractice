package io.everyonecodes.java.t7_consolidation.set1.exercise3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How large should your staircase be?");
        int max = scanner.nextInt();
        if (max < 1) {
            max = 1;
        }
        else if (max > 9) {
            max = 9;
        }
        String stairs = "";
        for (int i = 1; i <= max; i++) {
            String spaces = " ".repeat(max - i);
            stairs += i;
            String spacesAndStairs = spaces + stairs;
            System.out.println(spacesAndStairs);
        }
    }
}
