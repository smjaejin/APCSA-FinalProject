package com.apcsa.golf;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * if the ball enters the WaterTrap, it is moved to the location of the last swing, and movement is stopped
 * Created by apcsaper5 on 5/24/17.
 */
public class WaterTrap extends Wall {



    public WaterTrap(double x1, double y1, double halfWidth, double halfHeight) {
        super(x1,y1,halfWidth,halfHeight);
        color = new Color(0,105,148);
    }

    void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x1, y1, halfWidth, halfHeight);
    }

    void interact(Ball b) {

        if (checkInside(b)){
            Point2D.Double p = new Point2D.Double();
            //b.setPos(p);
            b.setMotionX(0);
            b.setMotionY(0);
            b.setPosX(b.getLastX());
            b.setPosY(b.getLastY());
        }
    }

}
