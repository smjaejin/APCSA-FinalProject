package com.apcsa.golf;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

/**
 * acts as a wall, but bouncing also increases speed
 * Created by apcsaper5 on 5/31/17.
 */

public class SoftWall extends Wall {

    public double x1, y1, halfWidth, halfHeight;

    public Color color=Color.MAGENTA;

    public SoftWall(double x1, double y1, double halfWidth, double halfHeight) {
        super(x1,y1,halfWidth,halfHeight);
    }

    void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x1,y1, halfWidth, halfHeight);
    }

    void interact(Ball b){
        if (checkBottom(b)||checkLeft(b)||checkRight(b)||checkTop(b)){
            b.setMotionX(0.0);
            b.setMotionY(0.0);
        }
    }
}
