package io.everyonecodes.java.t4_ifelse.set1.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    static final Cards screws = new Cards("Screws");
    static final Cards sparks = new Cards("Sparks");
    static final Cards circuits = new Cards("Circuits");

    static final List<Cards> cardList = new ArrayList<Cards>(List.of(screws, sparks, circuits));

    public static void main(String[] args) {
        int score = 13;
        System.out.println("Name a picture!");
        String pictureName = scanner.nextLine();
        for (Cards cards : cardList) {
            if (pictureName.equals(cards.name) && score + cards.points < 20) {
                score += cards.points;
                System.out.println("That’s " + score + " points. I almost got you there! Well played!");
                break;
            }
            else if (pictureName.equals(cards.name) && score + cards.points >= 20) {
                score += cards.points;
                System.out.println("That’s"+ score +"points. Yay! I won!");
                break;
            }
            else {
                System.out.println("Oops! I don’t have it! That’s 13 points. Well played!");
                break;
            }
        }

    }
}
