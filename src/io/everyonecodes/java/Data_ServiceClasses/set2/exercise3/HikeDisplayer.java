package io.everyonecodes.java.Data_ServiceClasses.set2.exercise3;

import java.util.ArrayList;
import java.util.List;

public class HikeDisplayer {

    public void display(Hike hike) {
        List<String> hikersNames = new ArrayList<>(List.of());
        for (Hiker hiker : hike.getListOfHikers()) {
            hikersNames.add(hiker.getName());
        }
        System.out.println("Date: " + hike.getDate() + "\n Hikers: \n" + hikersNames );
    }
}
