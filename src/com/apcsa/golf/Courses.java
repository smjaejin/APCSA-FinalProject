package com.apcsa.golf;

/**
 * Created by apcsaper5 on 5/31/17.
 */
import java.util.ArrayList;


public class Courses {
    ArrayList<Course> holes;
    int holeNumber;

    public Courses(){
        holes = new ArrayList<Course>();
        holeNumber = -1;
    }

    public Course nextCourse(){
        holeNumber++;
        return holes.get(holeNumber);
    }

}
