package com.apcsa.golf;


import java.awt.*;

/**
 * Created by apcsaper5 on 5/22/17.
 */
public abstract class Obstacle {

    public double xB, yB, halfWidth, halfHeight;
    boolean trueFalse;

    public Color color;

    void draw() {

    }

    void interact(Ball b){

    }

    boolean checkTop(Ball b) {
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB)) && y1 >= yB + halfHeight;
    }

    boolean checkBottom(Ball b) {
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB)) && y1 <= yB - halfHeight;
    }
    boolean checkRight(Ball b) {
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB)) && x1 >= xB + halfWidth;
    }

    boolean checkLeft(Ball b) {
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB)) && x1 <= xB - halfWidth;
    }
    boolean checkInside(Ball b){
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB));
    }
}

