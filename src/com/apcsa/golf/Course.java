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

    public Course(int i){// for some reason there is an invisible wall or somthing in this course
        courseObjects = new ArrayList<Obstacle>();
        b = new Ball(-.8, .8);
        courseObjects.add(new Mat(-.9, .8));
        courseObjects.add(new Hole(.75, -.75));
        courseObjects.add(new SandPit(0,0,.65,.65));
        courseObjects.add(new SandPit(.95,0,.05,1));//i might also want to change these to water later
        courseObjects.add(new SandPit(-.95,0,.05,1));
        courseObjects.add(new SandPit(0,.95,1,.05));
        courseObjects.add(new SandPit(0,-.95,1,.05));

    }

    public Course(String i){
        courseObjects = new ArrayList();
        b = new Ball(.75, .6);
        courseObjects.add(new Mat(9, .6));
        courseObjects.add(new Hole(-.6, -.6));
        courseObjects.add(new Ice(.1,0.5,1,1));
        courseObjects.add(new Ice(.5,0.1,1,1));
        courseObjects.add(new WaterTrap(0,-0.95,1,.05));
        courseObjects.add(new WaterTrap(.95,0,.05,1));//this one acts as a wall for some reason
        courseObjects.add(new WaterTrap(-.95,0,.05,1));
        courseObjects.add(new WaterTrap(0,.95,1,.05));
        courseObjects.add(new Wall(-.6,-.5,.1,.01));
        courseObjects.add(new Wall(-.5,-.6,.01,.1));
        courseObjects.add(new Wall(-.9,-.65,.015,.25));
        courseObjects.add(new Wall(-.65,-.9,.25,.015));

    }

    public Course(double i){
        courseObjects = new ArrayList<Obstacle>();

    }

    public Ball getBall(){
        return b;
    }
}
