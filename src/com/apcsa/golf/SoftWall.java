package com.apcsa.golf;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

/**
 * acts as a wall, but bouncing also increases speed
 * Created by apcsaper5 on 5/31/17.
 */

public class SoftWall extends Wall {

    public double xB, yB, halfWidth, halfHeight;

    public Color color=Color.MAGENTA;

    public SoftWall(double xB, double yB, double halfWidth, double halfHeight) {
        super(xB,yB,halfWidth,halfHeight);
    }

    void interact(Ball b){
        if (checkInside(b)){
            b.setMotionX(0.0);
            b.setMotionY(0.0);
            b.setPosX(b.getPosX());
            b.setPosY(b.getPosY());
        }
    }
}
