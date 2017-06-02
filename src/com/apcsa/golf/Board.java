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
    Ball ball;
    Wall wall;
    Hole hole;
    Mat mat;

    public static void main(String[] args) {
        new Board();
    }

    public Board(){

        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.setCanvasSize();
        StdDraw.clear(lawn = new Color(46, 93, 0));

        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.line(.6,0,-.6,0);
        StdDraw.setPenColor(Color.RED);
        mat = new Mat(0, .6);
        wall = new Wall(0,-.75,.6,.08);
        hole = new Hole(.75,-.75);
        ball = new Ball();
        mat.assignBallStart(ball);
        ball.draw();
        hole.draw();
        StdDraw.show();
        update();

    }

    public void update(){
        //StdDraw.setCanvasSize();
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.enableDoubleBuffering();
        // StdDraw.setScale();
        while (hole.endOfGame(ball)) {
            StdDraw.clear(lawn);
            StdDraw.setPenRadius(0.05);
            StdDraw.setPenColor(StdDraw.BLACK);
            hole.draw();//hole
            mat.draw();
//            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
//            StdDraw.line(.6,0,-.6,0);

            wall.draw();
            wall.interact(ball);
            ball.swing(ball);
            ball.move();
            ball.draw();
            StdDraw.show();

            //endOfGame();
            StdDraw.pause(15);


        }
        hole.gameOverDraw();
        System.out.print("end");
        StdDraw.show();
        //StdDraw.clear(lawn);
    }


//    public boolean endOfGame() {
//        if ( Math.abs(ball.getPosX() - 0) < .035  && Math.abs(ball.getPosY() - (-.75) ) < .035 ){
//
//            gameStatus = false;
//            System.out.println("Hole completed.");
//            StdDraw.clear(lawn);
//            StdDraw.setPenRadius(0.05);
//            StdDraw.setPenColor(StdDraw.BLACK);
//            StdDraw.point(ball.getHoleX(), ball.getHoleY());//hole
//            StdDraw.setPenColor(mat);
//            StdDraw.filledRectangle(-.35,.75,.35,.2);
//            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
//            StdDraw.line(.6,0,-.6,0);
//            ball.gameOverDraw();
//
//        }
//        return gameStatus;
//    }

//    public boolean returnGameStatus(){
//        return gameStatus;
//    }

    public Color returnLawnColor() {return lawn;}









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
