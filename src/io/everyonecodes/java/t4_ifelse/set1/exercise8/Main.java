package io.everyonecodes.java.t4_ifelse.set1.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static final List<String>dereksFlavors = new ArrayList<String>(List.of("vanilla", "stracciatella"));

    static final List<String>matildasFlavors = new ArrayList<String>(List.of("strawberry", "chocolate", "lemon"));

    public static boolean hasDereksFlavors(List<String> listOfAvailableFlavors) {
        return listOfAvailableFlavors.containsAll(dereksFlavors) ;
    }

    public static boolean hasMatildasFlavors(List<String> listOfAvailableFlavors) {
        return listOfAvailableFlavors.containsAll(matildasFlavors);
    }

    public static boolean isRestaurantOk(String restaurantName) {
        return isRestaurantOpen(restaurantName)
                && hasDereksFlavors(getAvailableFlavors(restaurantName))
                    && hasMatildasFlavors(getAvailableFlavors(restaurantName));
    }

    public static boolean isRestaurantOpen(String restaurantName) {
        // All restaurants seem to be open at the moment
        return true;
    }
    public static String goToBitFreezeRestaurant() {
        if (isRestaurantOk("Byte-Greissler")) {
            return "Byte-Greissler it is!";
        }
        if (isRestaurantOk("Ti-Chy")) {
            return "Ti-Chy it is!";
        }
        return "All bit-freeze restaurants are bad!";
    }

    public static List<String> getAvailableFlavors(String restaurantName) {
        // Returns the list of flavors the two restaurants have.
        // If the restaurant name is unknown, return an empty list
        if (restaurantName.equals("Byte-Greissler")) {
            return List.of("strawberry", "chocolate", "vanilla");
    } else if (restaurantName.equals("Ti-Chy")) {
        return List.of("stracciatella", "chocolate", "lemon", "hazelnut");
    } else {
        return List.of();
    }
}


public static void main(String[] args) {

    }
}
