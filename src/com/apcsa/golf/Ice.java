package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

import static java.awt.Color.WHITE;
import static java.awt.Color.white;

/**
 * Negates all friction while on Ice
 * Created by apcsaper5 on 5/31/17.
 */
public class Ice extends Obstacle {
    public double xB, yB, halfWidth, halfHeight;

    Color color=new Color(200,200,200);
    //Color white;

    public Ice(double xB, double yB, double halfWidth, double halfHeight) {
        //super(xB, yB, halfWidth, halfHeight);
        //white = new Color(255,255,255);
        this.xB = xB;
        this.yB = yB;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
        color = new Color(192,235,234);
    }

//
//    void interact(Ball b){
//        b.setMotionY(b.getMotionY() * (2-b.getFRICTION()));
//        b.setMotionX(b.getMotionX() * (2-b.getFRICTION()));
//    }
//      this one would just make the entire board slippery... idk it might be easier for the one i have

    void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(xB, yB, halfWidth, halfHeight);
    }

    void interact(Ball b) {
//        if ((b.getPosX() <= -halfWidth+.02 && b.getPosX() >=halfWidth+.02) && b.getPosY() >= -halfHeight+.02 && b.getPosY() <= halfHeight+.02 && Math.abs(b.getPosY())>y1+halfHeight){
//            b.setMotionX(b.getMotionX()*700);
////            b.setMotionY(b.getMotionY()*700);
//        }
//        if ((b.getPosX() >= -halfWidth+.02 && b.getPosX() <=halfWidth+.02) && b.getPosY() >= -halfHeight+.02 && b.getPosY() <= halfHeight+.02 && Math.abs(b.getPosX())>x1+halfWidth){
////            b.setMotionX(b.getMotionX()*700);
//            b.setMotionY(b.getMotionY()*700);
//        }
//        if (checkInside(b)) {
//            b.setMotionY(b.getMotionY() * 1.5);
//            b.setMotionX(b.getMotionX() * 1.5);
//        }
        b.setMotionY(b.getMotionY() * 1.00151);//sets course to ice field
        b.setMotionX(b.getMotionX() * 1.00151);//sets course to ice field
    }

    //public void setBoostScale(double newBoost){boost=newBoost;}


}


