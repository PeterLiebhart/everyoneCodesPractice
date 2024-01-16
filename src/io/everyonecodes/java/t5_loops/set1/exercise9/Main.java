package io.everyonecodes.java.t5_loops.set1.exercise9;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static boolean isWearingHat() {
        System.out.println("Is the person wearing a hat?");
        return scanner.nextBoolean();
    }

    public static boolean isBringingPet() {
        System.out.println("Is the person bringing a pet?");
        return scanner.nextBoolean();
    }

    public static boolean isListeningToMusic() {
        System.out.println("Is the person listening to music?");
        return scanner.nextBoolean();
    }

    public static void main(String[] args) {
        int hats = 0;
        int pets = 0;
        int music = 0;
        for (int i = 0; i < 5; i++) {
            if (isBringingPet()) {
                pets++;
            }
            else if (isWearingHat()) {
                hats++;
            }
            else if (isListeningToMusic()) {
                music++;
            }
        }
        System.out.println("Hats: " + hats);
        System.out.println("Pets: " + pets);
        System.out.println("Listening to music: " + music);
    }
}
