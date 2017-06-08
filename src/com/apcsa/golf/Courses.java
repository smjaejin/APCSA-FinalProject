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
        holes.add(new Course());
        holes.add(new Course(1));
        holes.add(new Course("i"));
        holes.add(new Course(2.0));
    }

    public Course nextCourse(){
        holeNumber++;
        if(holeNumber>holes.size()){
            return new Course();
        }
        return holes.get(holeNumber);
    }

}
