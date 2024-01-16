package io.everyonecodes.java.t7_consolidation.set1.exercise9;

import java.awt.*;

public class Player {

    Point position;

    int moveRightCount = 0;
    int moveLeftCount = 0;

    enum Movements {
        UP, DOWN, LEFT, RIGHT
    }

    public Player(Point position) {
        this.position = position;
    }


    public void move(Movements movements) {
        switch (movements) {
            case DOWN:
                position.y += 1;
                break;
            case UP:
                position.y -= 1;
                break;
            case LEFT:
                position.x -= 1;
                moveLeftCount++;
                moveRightCount--;
                break;
            case RIGHT:
                position.x += 1;
                moveRightCount++;
                moveLeftCount--;
                break;
        }
    }

}
