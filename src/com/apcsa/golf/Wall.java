package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * If the ball hits the wall, the ball "bounces" off from the wall
 * Created by apcsaper5 on 5/22/17.
 */
public class Wall extends Obstacle {

    public double xB, yB, halfWidth, halfHeight;

    Color color;

    public Wall(double xB, double yB, double halfWidth, double halfHeight) {
        this.xB = xB;
        this.yB = yB;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
        color = Color.GRAY;

    }

    void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(xB, yB, halfWidth, halfHeight);
    }


    void interact(Ball b) {
        //old collisons just in case
//        if ((b.getPosX() >= -halfWidth-.02 && b.getPosX() <=halfWidth+.02) && b.getPosY() >= -halfHeight-.02 && b.getPosY() <= halfHeight+.02 && Math.abs(b.getPosY())>=xB+halfHeight){
//            b.setMotionY(b.getMotionY()*-1);
//        }
//        if ((b.getPosX() >= -halfWidth-.02 && b.getPosX() <=halfWidth+.02) && b.getPosY() >= -halfHeight-.02 && b.getPosY() <= halfHeight+.02 && Math.abs(b.getPosX())>=xB+halfWidth){
//            b.setMotionX(b.getMotionX()*-1);
//        }
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        double slopeI = b.getMotionX() / b.getMotionY();

        if (checkTop(b) && checkRight(b)) {
            b.setMotionX(-b.getMotionX());
            b.setMotionY(-b.getMotionY());
        } else if (checkTop(b) && checkLeft(b)) {
            b.setMotionX(-b.getMotionX());
            b.setMotionY(-b.getMotionY());
        } else if (checkBottom(b) && checkRight(b)) {
            b.setMotionX(-b.getMotionX());
            b.setMotionY(-b.getMotionY());
        } else if (checkBottom(b) && checkLeft(b)) {
            b.setMotionX(-b.getMotionX());
            b.setMotionY(-b.getMotionY());
        }
        if (checkTop(b)) {
            Point2D.Double p = new Point2D.Double((halfHeight + b.radius - y1) * slopeI + x1, halfHeight + b.radius + yB);
            System.out.println("top");
            b.setPos(p);
            b.setMotionY(b.getMotionY() * -1);
        } else if (checkBottom(b)) {
            Point2D.Double p = new Point2D.Double((-halfHeight - b.radius - y1) * -slopeI + x1, -halfHeight - b.radius + yB);
            b.setPos(p);
            System.out.println("bot");
            b.setMotionY(b.getMotionY() * -1);
        } else if (checkRight(b)) {
            Point2D.Double p = new Point2D.Double((halfWidth - b.radius - y1) * slopeI + x1, halfWidth + b.radius + yB);
            b.setPos(p);
            System.out.println("right");
            b.setMotionX(b.getMotionX() * -1);
        } else if (checkLeft(b)) {
            Point2D.Double p = new Point2D.Double((-halfWidth - b.radius - y1) * -slopeI + x1, -halfWidth - b.radius);
            b.setPos(p);
            System.out.println("left");
            b.setMotionX(b.getMotionX() * -1);
        }

    }
}