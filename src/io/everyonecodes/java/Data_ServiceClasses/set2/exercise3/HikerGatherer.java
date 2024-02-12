package io.everyonecodes.java.Data_ServiceClasses.set2.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HikerGatherer {

    static Scanner scanner = new Scanner(System.in);

    public HikerGatherer() {
    }

    public List<Hiker> gather() {
        List<Hiker> hikersList = new ArrayList<>(List.of());
        String hikerName = "default";
        String telephoneNumber = "";

        while (!hikerName.isBlank()) {

            System.out.println("Enter the hikers name: \n");
            hikerName = scanner.nextLine();

            if (!hikerName.equals("")) {
                System.out.println("Enter the hikers telephone number: \n");

                telephoneNumber = scanner.nextLine();

                Hiker hiker = new Hiker(hikerName, telephoneNumber);
                hikersList.add(hiker);
            }
        }

        return hikersList;

    }
}
