package io.everyonecodes.java.t5_loops.set1.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> guests = getGuestNames();
    public static void greetGuests(List<String> guests) {
        for (String guest : guests) {
            System.out.println("Hi " + guest + ", nice to see you!");
        }
    }
    public static List<String> getGuestNames() {
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            guests.add("Guest" + i);
        }
        return guests;
    }
    public static void giveVIPTicket(String guest){
        System.out.println(guest + " received a VIP ticket.");
    }

    public static void sayGoodbye(List<String> guests) {
        for (String guest : guests) {
            System.out.println("Goodbye " + guest + "!");
        }
    }

    public static void main(String[] args) {
        int i = 0;
        for (String guest : guests) {
            giveVIPTicket(guest);
            i += 1;
            if (i == 10) {
                break;
            }
        }
        greetGuests(guests);
        sayGoodbye(guests);
    }



}
