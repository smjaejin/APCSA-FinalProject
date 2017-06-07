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

    public Course(int i){
        courseObjects = new ArrayList<Obstacle>();
        b = new Ball(-.8, .8);
        courseObjects.add(new Mat(-.9, .8));
        courseObjects.add(new Hole(.75, -.75));
        courseObjects.add(new SandPit(0,0,.65,.65));
        courseObjects.add(new SandPit(.95,0,.05,1));
        courseObjects.add(new SandPit(-.95,0,.05,1));
        courseObjects.add(new SandPit(0,.95,1,.05));
        courseObjects.add(new SandPit(0,-.95,1,.05));

    }

    public Course(String s){
        courseObjects = new ArrayList<Obstacle>();
        b = new Ball(-.8, .8);
        courseObjects.add(new Hole(.8,0));
        courseObjects.add(new Mat(-.9, .8));

//        Ice ice;
//        ice = new Ice(0,0,.5,.5);
        //ice.setSlipperyness(1.255);
        //courseObjects.add(new Ice(0,0,1,1));
        //courseObjects.add(new Wall(0,));
        courseObjects.add(new SoftWall(0,0.-95,.1,.05));
        courseObjects.add(new SoftWall(.95,0,.05,1));
        courseObjects.add(new SoftWall(-.95,0,.05,1));
        courseObjects.add(new SoftWall(0,.95,1,.05));


    }

    public Course(double i){
        courseObjects = new ArrayList<Obstacle>();

    }

    public Ball getBall(){
        return b;
    }
}
