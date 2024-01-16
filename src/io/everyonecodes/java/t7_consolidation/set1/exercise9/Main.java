package io.everyonecodes.java.t7_consolidation.set1.exercise9;

import java.awt.*;
import java.util.Scanner;

import static io.everyonecodes.java.t7_consolidation.set1.exercise9.Player.Movements.*;

public class Main {

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        GameBoard board = new GameBoard();
        Point middlePosition = new Point(board.width/2, board.height/2);
        Player player = new Player(middlePosition);
        board.printBoard(player);
        while (true) {
            System.out.println("Please enter a direction (up, down, left, right):");
            String input = scanner.nextLine();
            if (input.equals("up")) {
                player.move(UP);
            }
            else if (input.equals("down")) {
                player.move(DOWN);
            }
            else if (input.equals("left")) {
                player.move(LEFT);
            }
            else if (input.equals("right")) {
                player.move(RIGHT);
            }
            else {
                System.out.println("Invalid input");
                continue;
            }
            board.printBoard(player);
            if (player.position.x == 0 || player.position.x == board.width - 1 || player.position.y == 0 || player.position.y == board.height - 1) {
                System.out.println("You lost!");
                break;
            }
        }

    }

    public static void main(String[] args) {
        playGame();
    }
}
