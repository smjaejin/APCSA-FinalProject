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

    public void update() {
        //StdDraw.setCanvasSize();
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.filledRectangle(0,0,.5,.2);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.text(0,0, "Click to Start");
        StdDraw.show();
        waitForPress();
        course.b.draw();
        while (!course.courseObjects.get(0).trueFalse) {
            StdDraw.clear(lawn);
            course.b.move();
            course.b.swing(course.b);
            for (Obstacle j : course.courseObjects) {
                j.draw();
                j.interact(course.getBall());
            }
            course.b.draw();
            StdDraw.show();
            StdDraw.pause(1);
            if (course.courseObjects.get(0).trueFalse) {
                course = courses.nextCourse();
            }
        }
    }

    public void waitForPress(){
        boolean pause = false;
        while(!pause){
            if (StdDraw.mousePressed())
                pause=true;
        }
    }
}
