package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

/**
 * Created by apcsaper5 on 5/26/17.
 */
public class SandPit extends Obstacle {

    public double xB, yB, halfWidth, halfHeight;

    Color sand;

    public SandPit(double xB, double yB, double halfWidth, double halfHeight) {
        this.xB = xB;
        this.yB = yB;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
        sand = new Color(244,220,181);
    }

    void draw() {
        StdDraw.setPenColor(sand);
        StdDraw.filledRectangle(xB,yB, halfWidth, halfHeight);
    }

    void interact(Ball b){
        if (checkInside(b)){
            b.setMotionX(b.getMotionX()*.997);
            b.setMotionY(b.getMotionY()*.997);
        }
    }

    boolean checkInside(Ball b){
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB));
    }

}
