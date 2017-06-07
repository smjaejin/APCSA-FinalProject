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
    Courses courses;
    Course course;
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
        StdDraw.show();
        courses = new Courses();
        course = courses.nextCourse();
        update();

    }

    public void update(){
        //StdDraw.setCanvasSize();
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.enableDoubleBuffering();
        course.b.draw();
        System.out.println(course.courseObjects.get(1).trueFalse);
        while(course.courseObjects.get(1).trueFalse){
            StdDraw.clear(lawn);
            course.b.move();
            course.b.swing(course.b);
            for(Obstacle j: course.courseObjects) {
                j.draw();
                j.interact(course.getBall());
            }
            course.b.draw();
            StdDraw.show();
            StdDraw.pause(1);
        }
//        while (hole.endOfGame(ball)) {
//            ball.move();
//            ball.draw();
//            StdDraw.show();
//
//            //endOfGame();
//            StdDraw.pause(1);
//
//
//        }
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
