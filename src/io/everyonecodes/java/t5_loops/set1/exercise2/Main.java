package io.everyonecodes.java.t5_loops.set1.exercise2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        do {
            System.out.println("Say a number between 1 and 10! ");
            num = scanner.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("Alright! Let’s perform a trick with the number " + num);
        }
    }


// Do/While
// Call function
