package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

import static java.awt.Color.WHITE;

/**
 * Negates all friction while on Ice
 * Created by apcsaper5 on 5/31/17.
 */
public class Ice extends Wall {
    public double xB, yB, halfWidth, halfHeight;

    Color color = Color.LIGHT_GRAY;

    public Ice(double xB, double yB, double halfWidth, double halfHeight) {
        super(xB, yB, halfWidth, halfHeight);
    }

    void draw(){
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(xB, yB, halfWidth, halfHeight);
    }


    void interact(Ball b) {
        if (checkInside(b)) {
            b.setMotionY(b.getMotionY() * 1.0015);
            b.setMotionX(b.getMotionX() * 1.0015);
        }
    }

    //public void setBoostScale(double newBoost){boost=newBoost;}


}


