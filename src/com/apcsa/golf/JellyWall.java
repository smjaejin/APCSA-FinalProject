package com.apcsa.golf;
import edu.princeton.cs.introcs.StdDraw;

/**
 * Created by apcsaper5 on 5/31/17.
 */

public class JellyWall extends Obstacle {
    public double x1, y1, halfWidth, halfHeight;

    public JellyWall(double x1, double y1, double halfWidth, double halfHeight) {
        this.x1 = x1;
        this.y1 = y1;
        this.halfWidth = halfWidth;
        this.halfHeight = halfHeight;
    }

    void draw() {
        StdDraw.setPenColor(StdDraw.PINK);
        StdDraw.filledRectangle(x1,y1, halfWidth, halfHeight);
    }

    void interact(Ball b){
        if ((b.getPosX() >= -halfWidth-.02 && b.getPosX() <=halfWidth+.02) && b.getPosY() >= -halfHeight-.02 && b.getPosY() <= halfHeight+.02 && Math.abs(b.getPosY())>=x1+halfHeight){
            b.setMotionY(b.getMotionY()*-1.5);
        }
        if ((b.getPosX() >= -halfWidth-.02 && b.getPosX() <=halfWidth+.02) && b.getPosY() >= -halfHeight-.02 && b.getPosY() <= halfHeight+.02 && Math.abs(b.getPosX())>=x1+halfWidth){
            b.setMotionX(b.getMotionX()*-1.5);
        }
    }
}
