package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.*;

/**
 * Created by apcsaper5 on 6/2/17.
 */
public class Mat extends Obstacle {
    double mX, mY;

    public Mat(double mX, double mY){
        this.mX = mX;
        this.mY = mY;

    }

    void draw() {
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(new Color(160, 112, 70));
        StdDraw.filledRectangle(mX, mY, .3, .2);
    }
}
