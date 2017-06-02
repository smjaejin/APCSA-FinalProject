package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by apcsaper5 on 5/22/17.
 */
public class Wall extends Obstacle {

    public double xB, yB, halfWidth, halfHeight;

    public Wall(double xB, double yB, double halfWidth, double halfHeight) {
        this.xB = xB;
        this.yB = yB;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
    }

    void draw() {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledRectangle(x1, y1, halfWidth, halfHeight);
    }

    void interact(Ball b) {
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        double slopeI = b.getMotionX() / b.getMotionY();

        if (checkTop(b)&&checkRight(b)){
            b.setMotionX(-b.getMotionX());
            b.setMotionY(-b.getMotionY());
        }
        else if (checkTop(b)&&checkLeft(b)){
            b.setMotionX(-b.getMotionX());
            b.setMotionY(-b.getMotionY());
        }
        else if (checkBottom(b)&&checkRight(b)){
            b.setMotionX(-b.getMotionX());
            b.setMotionY(-b.getMotionY());
        }
        else if (checkBottom(b)&&checkLeft(b)){
            b.setMotionX(-b.getMotionX());
            b.setMotionY(-b.getMotionY());
        }
        if (checkTop(b)) {
            Point2D.Double p = new Point2D.Double((halfHeight + b.radius - y1) * slopeI + x1, halfHeight + b.radius);
            System.out.println("top");
            b.setPos(p);
            b.setMotionY(b.getMotionY() * -1);
        }
        else if (checkBottom(b)) {
            Point2D.Double p = new Point2D.Double((-halfHeight - b.radius - y1) * -slopeI + x1, -halfHeight - b.radius);
            b.setPos(p);
            System.out.println("bot");
            b.setMotionY(b.getMotionY() * -1);
        }
        else if (checkRight(b) ){
            Point2D.Double p = new Point2D.Double((halfWidth - b.radius - y1) * slopeI + x1, halfWidth + b.radius);
            b.setPos(p);
            System.out.println("right");
            b.setMotionX(b.getMotionX() * -1);
        }
        else if (checkLeft(b)) {
            Point2D.Double p = new Point2D.Double((-halfWidth - b.radius - y1) * -slopeI + x1, -halfWidth - b.radius);
            b.setPos(p);
            System.out.println("left");
            b.setMotionX(b.getMotionX() * -1);
        }

    }

    boolean checkTop(Ball b) {
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB)) && y1 >= yB + halfHeight;
    }

    boolean checkBottom(Ball b) {
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB)) && y1 <= yB - halfHeight;
    }
    boolean checkRight(Ball b) {
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB)) && x1 >= xB + halfWidth;
    }

    boolean checkLeft(Ball b) {
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        return ((x1 >= -halfWidth - b.radius + xB && x1 <= halfWidth + b.radius + xB) && (y1 >= -halfHeight - b.radius + yB && y1 <= halfHeight + b.radius + yB)) && x1 <= xB - halfWidth;
    }
}
