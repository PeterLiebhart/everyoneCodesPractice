package io.everyonecodes.java.t3_predefinedmethods_lists.reflection.exercise1;

public class Main {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String digits = "0123456789";

        String string = alphabet.substring(21, 23).toUpperCase() + digits.substring(8, 9) + digits.substring(4, 7);                                          //"VW8456";

        System.out.println(string);
    }
}
