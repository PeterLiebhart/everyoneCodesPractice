package io.everyonecodes.java.t6_classes.reflection.excercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void printSummary(List<TravelDiary> travelDiaryList) {
        for (TravelDiary diary : travelDiaryList) {
            if (!diary.places.isEmpty()) {
                System.out.println("Country: " + diary.country + "\n" + "Last visit: " + diary.yearOfLastVisit);
            }



        }
    }

    public static void main(String[] args) {
        List<String> placesInSerbia = new ArrayList<>(List.of("Belgrad", "Nis"));
        List<String> placesInAustria = new ArrayList<>(List.of("Vienna", "Styria"));
        List<String> placesInKorea = new ArrayList<>(List.of());
        TravelDiary serbia = new TravelDiary("Serbia", 2012, placesInSerbia);
        TravelDiary austria = new TravelDiary("Austria", 2023, placesInAustria);
        TravelDiary korea = new TravelDiary("Korea", 2001, placesInKorea);

        austria.yearOfLastVisit = 1999;
        austria.places.add("Lower Austria");

        List<TravelDiary> diaries = new ArrayList<>(List.of(serbia, austria, korea));

        printSummary(diaries);
    }
}
