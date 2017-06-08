package com.apcsa.golf;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * if the ball enters the WaterTrap, it is moved to the location of the last swing, and movement is stopped
 * Created by apcsaper5 on 5/24/17.
 */
public class WaterTrap extends Obstacle {

    Color blue;
    double xB,yB,halfWidth,halfHeight;

    public WaterTrap(double xB, double yB, double halfWidth, double halfHeight) {
        this.blue = Color.BLUE;
        this.xB = xB;
        this.yB = yB;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
    }

    void draw() {
        StdDraw.setPenColor(blue);
        StdDraw.filledRectangle(xB, yB, halfWidth, halfHeight);
    }
    void interact(Ball b) {
        if (checkInside(b)){
            b.setPos(new Point2D.Double(b.lastX,b.lastY));
            b.setMotionX(0);
            b.setMotionY(0);
        }
    }

    boolean checkInside(Ball b){
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB));
    }
}
