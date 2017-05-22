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

    private boolean gameStatus = true;

    public static void main(String[] args) {
        new Board();
    }

    public Board(){

        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.setCanvasSize();
        StdDraw.clear(lawn = new Color(1,142,14));
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.point(0,-.75);
        StdDraw.setPenColor(mat = new Color(160,82,45));
        StdDraw.filledRectangle(-.5,.75,.35,.2);
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.line(.6,0,-.6,0);
        StdDraw.setPenColor(Color.RED);

        ball = new Ball();
        ball.draw();
        StdDraw.show();
        update();

    }

    public void update(){
        //StdDraw.setCanvasSize();
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.enableDoubleBuffering();
       // StdDraw.setScale();
        while (gameStatus) {
            StdDraw.clear(lawn);
            StdDraw.setPenRadius(0.05);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.point(0,-.75);
            StdDraw.setPenColor(mat);
            StdDraw.filledRectangle(-.35,.75,.35,.2);
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.line(.6,0,-.6,0);

            ball.move();
            ball.draw();
            StdDraw.show();
            endOfGame();
            StdDraw.pause(20);


        }
    }

    public boolean endOfGame() {
        if ( Math.abs(ball.getPosX() - 0) < .035  && Math.abs(ball.getPosY() - (-.75) ) < .035 ){

            gameStatus = false;
            System.out.println("Hole completed.");
            StdDraw.clear(lawn);
            StdDraw.setPenRadius(0.05);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.point(0,-.75);
            StdDraw.setPenColor(mat);
            StdDraw.filledRectangle(-.35,.75,.35,.2);
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.line(.6,0,-.6,0);
        }
        return gameStatus;
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