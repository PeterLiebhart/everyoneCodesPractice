package io.everyonecodes.java.t4_ifelse.reflection.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    static Scanner scanner = new Scanner(System.in);
    static List<String> brands = new ArrayList<String>(List.of("cLular", "Hawaii", "SunSong"));

    public static boolean shouldBuyPhone(int price, String brand) {
        return price <= 600 && price >= 150 && brands.contains(brand);
    }

    public static void main(String[] args) {

        System.out.println("How expensive is this cell phone?");
        int price = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Which brand is it?");
        String brand = scanner.nextLine();

        if (shouldBuyPhone(price, brand)) {
            System.out.println("I will buy this one, thanks!");
    }
        else System.out.println("Can you show me another one?");
}
}
