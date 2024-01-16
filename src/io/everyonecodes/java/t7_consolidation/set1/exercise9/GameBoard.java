package io.everyonecodes.java.t7_consolidation.set1.exercise9;

import java.awt.*;

public class GameBoard {
    int width = 60;
    int height = 15;

    public void printBoard(Player player) {

        System.out.println("–".repeat(width));
        int topAndBottom = width - 2;

        for (int i = 1; i < (this.height); i++) {
            if (i == player.position.y) {
                System.out.println("|" + " ".repeat(player.position.x) + "X" + " ".repeat(topAndBottom - player.position.x - 1) + "|");
            }
            else{
                System.out.println("|" + " ".repeat(topAndBottom) + "|");
            }
        }
        System.out.println("–".repeat(this.width));

    }
}
