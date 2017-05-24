package com.apcsa.golf; /**
 * Created by Finley on 5/10/17.
 */
import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class Ball {
    public double posX, posY, width, height, radius;
    public double motionX, motionY;
    final double FRICTION, STOPPED;

    public Ball() {
        posX = 0;
        posY = .75;
        motionX = 0.0;//StdRandom.uniform(-0.015, 0.015);//assigns a random motion
        motionY = 0.0;//StdRandom.uniform(-0.015, 0.015);
        radius = .02;
        FRICTION = .99;
        STOPPED = .0005;
    }

    // move the ball one step
    public void move() {
        if (Math.abs(posX + motionX) + radius > 1.0) motionX = -motionX;//bounces of either side - x velocity reversed
        if (Math.abs(posY + motionY) + radius > 1.0) motionY = -motionY;//bounces of top or bottom - y velocity reversed
        posX = posX + motionX;
        posY = posY + motionY;
        motionX *= FRICTION;
        motionY *= FRICTION;
        if (Math.abs(motionX) < STOPPED && Math.abs(motionY) < STOPPED) {
            motionX = 0;
            motionY = 0;
        }

    }

    // draw the ball
    public void draw() {
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.filledCircle(posX, posY, radius);
    }

   public void gameOverDraw() {

       posX = 0;
       posY = -.75;
       draw();
       StdDraw.setPenColor(Color.BLACK);
       StdDraw.filledCircle(posX, posY, radius+.01);
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double getMotionX(){return motionX;}

    public double getMotionY(){return motionY;}

    public double getRadius() {
        return radius;
    }

    public void calculateMotion(Ball b){
        double xMot = 0, yMot=0;

        while(StdDraw.mousePressed() == true) {
            xMot = StdDraw.mouseX() ;
            yMot = StdDraw.mouseY() ;
        }
        b.assignMotion(xMot, yMot);
    }

    public void assignMotion(double x, double y){
        motionX = x;
        motionY = y;
    }
}





