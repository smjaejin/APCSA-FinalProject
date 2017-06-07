package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.*;
/**
 * Created by apcsaper5 on 5/31/17.
 */
public class Hole extends Obstacle{
    private double hX, hY;
    Color lawn;
    Color mat;
    boolean truefalse;


    public Hole(double hX, double hY){
        this.hX = hX;
        this.hY = hY;
        trueFalse = true;
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
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(hX, hY, 100);
    }


    public void interact(Ball ball) {
        if ( Math.abs(ball.getPosX() - hX) < .035  && Math.abs(ball.getPosY() - (hY) ) < .035 ){

            trueFalse = false;
            System.out.println("Hole completed.");
            StdDraw.clear(lawn = new Color(46, 93, 0));
            StdDraw.setPenRadius(0.05);
            StdDraw.setPenColor(StdDraw.BLACK);
            draw();//hole
            StdDraw.setPenColor(mat);
            StdDraw.filledRectangle(-.35,.75,.35,.2);
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.line(.6,0,-.6,0);
            gameOverDraw();
        }
    }

    public boolean isTruefalse() {
        return trueFalse;
    }
}
