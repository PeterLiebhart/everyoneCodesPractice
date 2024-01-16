package io.everyonecodes.java.t3_predefinedmethods_lists.set1.exercise7;

public class Main {
    public static void main(String[] args) {
        String[] apparelList = {
                "blouse", "sneakers", "scarf", "sandals", "jeans", "shorts", "tank top", "blazer"
        };
        String tankTop = apparelList[6];
        String shorts = apparelList[5];
        String sneakers = apparelList[1];
        System.out.println("Matilda will wear: " + tankTop +"," + shorts + " and " + sneakers);
    }
}
