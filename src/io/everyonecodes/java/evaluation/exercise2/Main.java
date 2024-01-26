package io.everyonecodes.java.evaluation.exercise2;

import java.util.Scanner;

public class Main {

    public static String reverseString(String inputString) {

            StringBuilder stringBuildervarible = new StringBuilder();

            stringBuildervarible.append(inputString);

            stringBuildervarible.reverse();

            String reversedString = stringBuildervarible.toString();

            return reversedString;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text to reverse");
        String inputString = scanner.nextLine();
        while (!inputString.equals("stop")) {
            System.out.println("Reversed String: " + reverseString(inputString));
            if (reverseString(inputString).toLowerCase().equals(inputString.toLowerCase())) {
                System.out.println("That is a palindrome");
            }
            System.out.println("Enter some text to reverse");
            inputString = scanner.nextLine();
            }
        }
    }

