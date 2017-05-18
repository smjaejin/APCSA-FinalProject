package com.apcsa.golf;


import edu.princeton.cs.introcs.Draw;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;

/**
 * Created by apcsaper5 on 5/4/17.
 */
public class Board{
    Color lawn;
    Color mat;
    Ball ball;
    public static void main(String[] args) {
        new Board();
    }

    public Board(){

        StdDraw.setCanvasSize();
        StdDraw.setScale();
        StdDraw.clear(lawn = new Color(1,142,14));
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.point(0.5, 0.2);
        StdDraw.setPenColor(mat = new Color(160,82,45));
        StdDraw.filledRectangle(.5,.85, .15, .08);
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.line(0.2, 0.5, 0.8, 0.5);
        StdDraw.setPenColor(Color.RED);

        ball = new Ball();
        ball.draw();
        StdDraw.show();
        update();

    }

    public void update(){
        //StdDraw.setCanvasSize();
        StdDraw.setXscale(-1.0, +1.0);
        StdDraw.setYscale(-1.0, +1.0);
        StdDraw.enableDoubleBuffering();
       // StdDraw.setScale();
        while (true) {
            StdDraw.clear(lawn);
            StdDraw.setPenRadius(0.05);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.point(0.5, 0.2);
            StdDraw.setPenColor(mat);
            StdDraw.filledRectangle(.5, .85, .15, .08);
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.line(0.2, 0.5, 0.8, 0.5);
            StdDraw.setPenColor(Color.RED);
            ball.move();
            ball.draw();
            StdDraw.show();
            StdDraw.pause(20);
        }
    }

//    public void nextHole(int hole){
//        if (hole == 1){
//            StdDraw.clear(lawn);
//            //complete this hole
//        }
//    }
//
//    public void checkCollision(Ball b){
//
//    }
}