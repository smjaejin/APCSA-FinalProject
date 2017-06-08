package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

import static java.awt.Color.WHITE;

/**
 * Negates all friction while on Ice
 * Created by apcsaper5 on 5/31/17.
 */
public class Ice extends Wall {
    public double x1, y1, halfWidth, halfHeight;



    public Ice(double x1, double y1, double halfWidth, double halfHeight) {
        super(x1,y1,halfWidth, halfHeight);
    }

    void draw() {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(x1, y1, halfWidth, halfHeight);
    }

    void interact(Ball b) {
        if (checkInside(b)) {
            b.setMotionY(b.getMotionY() / .9984);
            b.setMotionX(b.getMotionX() / .9984);
        }
    }

    //public void setBoostScale(double newBoost){boost=newBoost;}


}


