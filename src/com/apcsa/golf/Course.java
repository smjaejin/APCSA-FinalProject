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

    public Course() {
            courseObjects = new ArrayList();
            b = new Ball(.75, .6);
            courseObjects.add(new Mat(0, .6));
            courseObjects.add(new Hole(.75, -.75));
            courseObjects.add(new Wall(0, -.75, .6, .08));
    }

    public Course(int pos) {
        if (pos == 0) {
        courseObjects = new ArrayList();
        b = new Ball(.75, .6);
        courseObjects.add(new Mat(0, .6));
        courseObjects.add(new Hole(.75, -.75));
        courseObjects.add(new Wall(0, -.75, .6, .08));
        }
        else if (pos==1){
            //create course 1
        }
        else if (pos==2){
            //create course 2
        }
        else if (pos==3){
            //create course 3
        }
        else if (pos==3){
            //create course 4
        }
        else if (pos==5){
            //create course 5
        }
    }



    public Course(String i){
        courseObjects = new ArrayList<Obstacle>();

    }

    public Course(double i){
        courseObjects = new ArrayList<Obstacle>();

    }

    public Ball getBall(){
        return b;
    }
}
