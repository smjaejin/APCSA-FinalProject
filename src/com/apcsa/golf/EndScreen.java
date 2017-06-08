package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

/**
 * Created by Sean on 6/7/2017.
 */
public class EndScreen extends Obstacle{
    int swings;
    public EndScreen(int i){
        swings = i;
    }

    void draw(){
        StdDraw.text(0,.25, "Congratulations, you finished in "+swings+" swings.");
    }
}
