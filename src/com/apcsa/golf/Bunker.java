package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

/**
 * An Obstacle object of Bunker, or sand trap, is implemented below.
 * Created by joseph on 5/24/17.
 */
public class Bunker extends Obstacle {


    public double x1, y1, halfWidth, halfHeight;

    public Bunker(double x1, double y1, double halfWidth, double halfHeight) {
        this.x1 = x1;
        this.y1 = y1;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;


    }


    public void draw() {
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.filledRectangle(x1, y1, halfWidth, halfHeight);
    }

    public boolean checkInBunkerX(Ball b) {
        if( (-.7 + .02 <= b.getPosX()) &&  (-.3 + .02 >= b.getPosX()) ){
            return true;
        }
        else
            return false;
    }

    public boolean checkInBunkerY(Ball b) {
        if ((-.7 + .02 <= b.getPosY()) && (-.3 + .02 >= b.getPosY())) {
            return true;
        } else
            return false;
    }


    public void interact(Ball b) {
        if (checkInBunkerX(b) && checkInBunkerY(b)) {
            System.out.println("bunker in");
            //b.setMotionX(b.getMotionX() * 0);
            //b.setMotionY(b.getMotionY() * 0);

        }


    }
}