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
    /**
     *  Creates the first course
     * */
    public Course() {
        courseObjects = new ArrayList();
        b = new Ball(.75, .6);
        courseObjects.add(new Hole(.75, -.75));
        courseObjects.add(new Mat(0, .7));
        courseObjects.add(new Wall(0, -.75, .6, .08));
    }
    /**
     *  Creates the second course
     * */
    public Course(int i){// for some reason there is an invisible wall or something in this course
        courseObjects = new ArrayList<Obstacle>();
        b = new Ball(-.6, .7);
        courseObjects.add(new Hole(.8,-.8));
        courseObjects.add(new Mat(-.6, .7));
        courseObjects.add(new Wall(0,0,.5,.05));
        courseObjects.add(new SandPit(-.75,0,.15,.05));
        courseObjects.add(new SandPit( .75,0,.15,.05));
    }
    /**
     *  Creates the third course
     * */
    public Course(String i){
        courseObjects = new ArrayList();
        b = new Ball(.7,.7);
        courseObjects.add(new Hole(-.6, -.6));
        courseObjects.add(new Mat(.6, .7));
        courseObjects.add(new Ice(.1,0,1,.5));
        courseObjects.add(new Ice(0,0.1,.5,1));
        courseObjects.add(new Ice(.7,-.75,.2,.25));
        courseObjects.add(new Ice(-.75,.7,.25,.2));
        courseObjects.add(new WaterTrap(0,-0.95,1,.05));
        courseObjects.add(new WaterTrap(.95,0,.05,1));//this one acts as a wall for some reason
        courseObjects.add(new WaterTrap(-.95,0,.05,1));
        courseObjects.add(new WaterTrap(0,.95,1,.05));
        courseObjects.add(new Wall(-.6,-.5,.1,.01));
        courseObjects.add(new Wall(-.5,-.6,.01,.1));
        courseObjects.add(new Wall(-.9,-.65,.015,.25));
        courseObjects.add(new Wall(-.65,-.9,.25,.015));

    }
    /**
     *  creates
     * */
    public Course(double i){
        courseObjects = new ArrayList<Obstacle>();

    }
    /**
     * Returns ball
     * */
    public Ball getBall(){
        return b;
    }
}
