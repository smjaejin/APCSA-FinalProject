package com.apcsa.golf;

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
    Color mat;
    public static void main(String[] args) {
        new Board();
    }

    public Board(){
        StdDraw.setCanvasSize();
        StdDraw.clear(lawn = new Color(1,142,14));
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.point(0.5, 0.2);
        StdDraw.setPenColor(mat = new Color(160,82,45));
        StdDraw.filledRectangle(.5,.85, .15, .08);
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.line(0.2, 0.5, 0.8, 0.5);
        StdDraw.show();

    }

    public void update(){
        checkCollision();
    }

    public void nextHole(int hole){
        if (hole == 1){
            StdDraw.clear(lawn);
            //complete this hole
        }
    }

    public void checkCollision(Ball b){

    }
}