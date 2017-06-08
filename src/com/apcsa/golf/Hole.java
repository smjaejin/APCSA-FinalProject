package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by apcsaper5 on 5/31/17.
 */
public class Hole extends Obstacle{
    private double hX, hY;
    Color lawn;
    boolean truefalse;


    public Hole(double hX, double hY){
        this.hX = hX;
        this.hY = hY;
        trueFalse = false;
        lawn = new Color(46, 93, 0);
    }

    public double gethX() {
        return hX;
    }

    public double gethY() {
        return hY;
    }

    void draw(){
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.point(hX,hY);
    }

    public void gameOverDraw() {
        StdDraw.clear(lawn);
        System.out.print("endDraw");
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.pause(25);
        StdDraw.text(0,0, "Hole Completed. Press Space for the next course");
        StdDraw.show();
        waitForPress();
    }
    public void waitForPress(){
        trueFalse = true;
        boolean pause = false;
        while(!pause){
            if (StdDraw.hasNextKeyTyped() && StdDraw.nextKeyTyped() == ' ')
                pause=true;
        }
    }


    public void interact(Ball ball) {
        if ( Math.abs(ball.getPosX() - hX) < .035  && Math.abs(ball.getPosY() - (hY) ) < .035 ){
            System.out.println("Hole completed.");
            ball.setPos(new Point2D.Double(hX,hY));
            ball.setMotionX(0);
            ball.setMotionY(0);
            gameOverDraw();
        }
    }

    public boolean isTruefalse() {
        return trueFalse;
    }
}