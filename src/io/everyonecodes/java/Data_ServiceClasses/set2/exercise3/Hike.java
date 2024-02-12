package io.everyonecodes.java.Data_ServiceClasses.set2.exercise3;

import java.util.List;

public class Hike {

    private String date;
    private List<Hiker> listOfHikers;

    public Hike(String date, List<Hiker> listOfHikers) {
        this.date = date;
        this.listOfHikers = listOfHikers;
    }

    public String getDate() {
        return date;
    }

    public List<Hiker> getListOfHikers() {
        return listOfHikers;
    }
}
