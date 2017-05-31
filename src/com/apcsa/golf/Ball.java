package com.apcsa.golf; /**
 * Created by Finley on 5/10/17.
 */
import edu.princeton.cs.introcs.*;

import java.awt.*;
import java.awt.geom.Point2D;

public class Ball {
    public double posX, posY, width, height, radius;
    public double motionX, motionY;
    final double FRICTION, STOPPED;
    public double hX,hY;

    public Ball() {
        posX = 0.0;
        posY = 0.75;
        motionX = 0.02;//StdRandom.uniform(-0.015, 0.015);//assigns a random motion
        motionY = 0.02;//StdRandom.uniform(-0.015, 0.015);//values are small so its smooth
        radius = .02;
        FRICTION = 1;//.989;
        STOPPED = .0005;
        hX = 0;
        hY= -.75;
    }

    // move the ball one step
    public void move() {
        if (Math.abs(posX + motionX) + radius > 1.0) motionX = -motionX;//bounces of either side - x velocity reversed
        if (Math.abs(posY + motionY) + radius > 1.0) motionY = -motionY;//bounces of top or bottom - y velocity reversed
        posX =  posX + motionX;
        posY = posY + motionY;
        motionX  *= FRICTION;
        motionY *= FRICTION;
        if(Math.abs(motionX) < STOPPED && Math.abs(motionY) < STOPPED){
            motionX = 0;
            motionY = 0;
        }

    }

    // draw the ball
    public void draw() {
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(posX,posY, radius);
        //StdDraw.filledCircle(.5,.5,.02);
    }

    public void gameOverDraw(){
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(hX, hY, radius);
    }

    public void swing(Ball b){
        double motX = 0, motY = 0;
        while(StdDraw.mousePressed() && (b.getMotionX()==0 && b.getMotionY() ==0)){
            motX = -(b.getMotionX() - (b.getPosX() - StdDraw.mouseX()));
            motY = -(b.getMotionY() - (b.getPosY() - StdDraw.mouseY()));
        }
        if(motX != 0 || motY != 0){
            motionX = motX *.05;
            motionY = motY *.05;
        }
    }

    public void setPos(Point2D.Double p){
        posX = p.getX();
        posY = p.getY();
    }

    public Point2D.Double nextPosition(){
        Point2D.Double p = new Point2D.Double(posX + motionX, posY +motionY);
        return p;
    }

    public double getPosX(){
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getPosY(){
        return posY;
    }
    public double getMotionX() {
        return motionX;
    }
    public double getMotionY() {
        return motionY;
    }
    public void setMotionX(double motionX) {
        this.motionX = motionX;
    }
    public void setMotionY(double motionY) {
        this.motionY = motionY;
    }

    public void printCoordinates(){
        System.out.println(  "Position: (" + getPosX()+ "," + getPosY() + ")" );
    }

    // test client
    public static void main(String[] args) {

        // create and initialize a ball
        Ball b1 = new Ball();


        // animate them
        StdDraw.setXscale(-1.0, +1.0);
        StdDraw.setYscale(-1.0, +1.0);
        StdDraw.enableDoubleBuffering();

        while (true) {
            StdDraw.clear(StdDraw.GRAY);
            StdDraw.setPenColor(StdDraw.BLACK);
            b1.move();
            b1.draw();
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}





