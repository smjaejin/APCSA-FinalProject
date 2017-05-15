package com.apcsa.golf;

/**
 * Created by Pro on 5/14/17.
 */
public class Ball {
    int strokes;
    double x, y, xSpeed, ySpeed;
    final double FRICTION;

    public Ball(int startX, int startY, int angle, int power){
        strokes = 0;
        this.x = startX;
        this.y = startY;
        this.xSpeed = 0; //do the math
        this.ySpeed = 0; //do the math
        FRICTION = .9;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setx(double x){
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void updatePos() {
        this.x += xSpeed;
        this.y += ySpeed;
        this.xSpeed *= FRICTION;
        this.ySpeed *= FRICTION;
    }

    public void nextStroke(double angle, double power){
        this.xSpeed = 0; //do the math
        this.ySpeed = 0; //do the math
        strokes++;
    }
}
