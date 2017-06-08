package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

import static java.awt.Color.WHITE;

/**
 * Negates all friction while on Ice
 * Created by apcsaper5 on 5/31/17.
 */
public class Ice extends Obstacle{
    public double x1, y1, halfWidth, halfHeight;

    public Ice(double x1, double y1, double halfWidth, double halfHeight) {
        this.x1 = x1;
        this.y1 = y1;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
    }

    void draw() {
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledRectangle(x1, y1, halfWidth, halfHeight);
    }

    void interact(Ball b) {
        if (checkInside(b)) {
            b.setMotionY(b.getMotionY() / b.FRICTION);
            b.setMotionX(b.getMotionX() / b.FRICTION);
        }
    }

    boolean checkInside(Ball b){
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB));
    }
}


