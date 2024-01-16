package io.everyonecodes.java.t4_ifelse.set1.exercise4;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static boolean askIfAtHome() {
        System.out.println("Are we at home?");
        return scanner.nextBoolean();
    }

    public static boolean askIfGrandmaIsUsingCableTelephone() {
        System.out.println("Grandma, are you using the cable telephone?");
        return scanner.nextBoolean();
    }

    public static void callWithCableTelephone() {
        System.out.println("Calling with cable telephone");
    }

    public static void callWithCellPhone() {
        System.out.println("Calling with cell phone");
    }

    public static void main(String[] args) {

        if (!askIfAtHome()) {
            callWithCellPhone();
        }
        else {
            if (askIfGrandmaIsUsingCableTelephone()) {
                callWithCellPhone();
            }
            else {
                callWithCableTelephone();
            }

        }
    }
}
