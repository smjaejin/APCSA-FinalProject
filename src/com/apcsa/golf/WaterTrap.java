package com.apcsa.golf;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * if the ball enters the WaterTrap, it is moved to the location of the last swing, and movement is stopped
 * Created by apcsaper5 on 5/24/17.
 */
public class WaterTrap extends Wall {
    Color blue;
    public WaterTrap(double xB, double yB, double halfWidth, double halfHeight) {
        super(xB,yB,halfWidth,halfHeight);
        blue = new Color(0,105,148);
    }
    void draw() {
        StdDraw.setPenColor(blue);
        StdDraw.filledRectangle(xB, yB, halfWidth, halfHeight);
    }
    void interact(Ball b) {
        if (checkInside(b)){
            //Point2D.Double p = new Point2D.Double();
            //b.setPos(p);
            b.setMotionX(0);
            b.setMotionY(0);
            b.setPosX(b.getLastX());
            b.setPosY(b.getLastY());
        }
    }
}
