package com.apcsa.golf;

/**
 * Created by apcsaper5 on 5/22/17.
 */

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

import java.util.ArrayList;
public class Course {

    Ball b;
    public ArrayList<Obstacle> courseObjects;

    public Course(){
        courseObjects = new ArrayList();
        b = new Ball(0,.6);
        courseObjects.add(new Hole(.75,-.75));
        courseObjects.add(new Mat(0,.6));
        courseObjects.add(new Wall(0,-.75,.6,.08));
    }

    public Course(int i){
        courseObjects = new ArrayList<Obstacle>();
        b = new Ball(0,.6);
        courseObjects.add(new Hole(.75,-.75));
        courseObjects.add(new Mat(0,.6));
    }

    public Course(String i){
        courseObjects = new ArrayList<Obstacle>();
        b = new Ball(0,.6);
        courseObjects.add(new Hole(.75,-.75));
        courseObjects.add(new Mat(0,.6));
    }

    public Course(double i){
        courseObjects = new ArrayList<Obstacle>();
        b = new Ball(0,.6);
        courseObjects.add(new Hole(.75,-.75));
        courseObjects.add(new Mat(0,.6));
    }

    public Ball getBall(){
        return b;
    }
}
