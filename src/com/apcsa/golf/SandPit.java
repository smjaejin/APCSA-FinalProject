package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

/**
 * Created by apcsaper5 on 5/26/17.
 */
public class SandPit extends Obstacle {

    public double xB, yB, halfWidth, halfHeight;

    Color color= new Color(244,220,181);

    public SandPit(double xB, double yB, double halfWidth, double halfHeight) {
        this.xB = xB;
        this.yB = yB;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
        color = new Color(244,220,181);
    }

    void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(xB,yB, halfWidth, halfHeight);
    }

    void interact(Ball b){
//        if ((b.getPosX() <= -halfWidth+.02 && b.getPosX() >=halfWidth+.02) && b.getPosY() >= -halfHeight+.02 && b.getPosY() <= halfHeight+.02 && Math.abs(b.getPosY())>y1+halfHeight){
//            b.setMotionY(b.getMotionY()*-1.001);
//        }
//        if ((b.getPosX() >= -halfWidth+.02 && b.getPosX() <=halfWidth+.02) && b.getPosY() >= -halfHeight+.02 && b.getPosY() <= halfHeight+.02 && Math.abs(b.getPosX())>x1+halfWidth){
//            b.setMotionX(b.getMotionX()*-1.001);
//        }
        //b.getMotionY() returns an int value, not a variable.
        //10 * 0.09
        if (checkInside(b)){
            b.setMotionX(b.getMotionX()*.5);
            b.setMotionY(b.getMotionY()*.55);
        }
    }

}
