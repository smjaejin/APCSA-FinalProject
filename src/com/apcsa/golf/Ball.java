package com.apcsa.golf; /**
 * Created by Finley on 5/10/17.
 */
import edu.princeton.cs.introcs.*;

import java.awt.*;
import java.awt.geom.Point2D;

public class Ball extends Obstacle{
    public double posX, posY, width, height, radius;
    public double motionX, motionY;
    final double FRICTION, STOPPED;
    public double lastX,lastY;
    int swings;

    public Ball(double posX, double posY) {
        swings = 0;
        motionX = 0.0;
        motionY = 0.0;
        radius = .02;
        FRICTION = .9977;
        STOPPED = .0001;
        this.posX = posX;
        this.posY = posY;
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
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.text(.8,.8,""+swings);
        //StdDraw.filledCircle(.5,.5,.02);
    }

    public void swing(Ball b){
        double motX = 0, motY = 0;
        while(StdDraw.mousePressed() && (b.getMotionX()==0 && b.getMotionY() ==0)){
            lastX=getPosX();
            lastY=getPosY();
            motX = -(b.getMotionX() - (b.getPosX() - StdDraw.mouseX()));
            motY = -(b.getMotionY() - (b.getPosY() - StdDraw.mouseY()));
        }
        if(motX != 0 || motY != 0){
            motionX = motX *.005;
            motionY = motY *.005;
            swings++;
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
    public double getPosY(){
        return posY;
    }
    public double getMotionX() {
        return motionX;
    }
    public double getMotionY() {
        return motionY;
    }
    public void setPosX(double posX) {
        this.posX = posX;
    }
    public void setPosY(double posY) {
        this.posY = posY;
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

}





