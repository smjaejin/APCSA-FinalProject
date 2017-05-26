package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by apcsaper5 on 5/22/17.
 */
public class Wall extends Obstacle{

    public double x, y, halfWidth, halfHeight;

    public Wall(double x, double y, double halfWidth, double halfHeight) {
        this.x = x;
        this.y = y;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
    }

    void draw() {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledRectangle(x1,y1, halfWidth, halfHeight);
    }

    void interact(Ball b){
        double x1 = b.nextPosition().getX();
        double y1 = b.nextPosition().getY();
        double slopeI = b.getMotionX()/b.getMotionY();

        if ((x1 >= -halfWidth - b.radius + x && x1 <=halfWidth + b.radius + x) && y1 >= -halfHeight - b.radius + y && y1 <= halfHeight + b.radius + y && y1 >=y+halfHeight){
            Point2D.Double p = new Point2D.Double((halfHeight - y1)*slopeI+x1,halfHeight+b.radius);
            b.setPos(p);
            b.setMotionY(b.getMotionY()*-1);
        }

        if ((x1 >= -halfWidth - b.radius + x && x1 <=halfWidth + b.radius + x) && y1 >= -halfHeight - b.radius + y && y1 <= halfHeight + b.radius + y && y1>=y-halfHeight){
            Point2D.Double p = new Point2D.Double((-halfHeight - y1)*slopeI+x1,-halfHeight-b.radius);
            b.setPos(p);
            b.setMotionY(b.getMotionY()*-1);
        }

        if ((x1 >= -halfWidth - b.radius + x && x1 <=halfWidth + b.radius + x) && y1 >= -halfHeight - b.radius + y && y1 <= halfHeight + b.radius + y && x1>=x+halfWidth){
            Point2D.Double p = new Point2D.Double((halfWidth - y1)*slopeI+x1,halfWidth+b.radius);
            b.setPos(p);
            b.setMotionX(b.getMotionX()*-1);
        }

        if ((x1 >= -halfWidth - b.radius + x && x1 <=halfWidth + b.radius + x) && y1 >= -halfHeight - b.radius + y && y1 <= halfHeight + b.radius + y && x1>=x-halfWidth){
            Point2D.Double p = new Point2D.Double((-halfWidth - y1)*slopeI+x1,-halfWidth-b.radius);
            b.setPos(p);
            b.setMotionX(b.getMotionX()*-1);
        }
    }
}
