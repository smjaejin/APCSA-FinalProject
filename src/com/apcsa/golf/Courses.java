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
        for (int i:5){Course(i);}
        holes.add(new Course());
       // holes.add(new Course(1));
        holes.add(new Course("i"));
        holes.add(new Course(2.0));
        holes.add(new Course(('c'));
        holes.add(new Course(());
        holes.add(new Course(true));
        holes.add(new Course((short)1));


    }

    public Course nextCourse(){
        holeNumber++;
        return holes.get(holeNumber);
    }

}