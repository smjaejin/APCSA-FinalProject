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

    public static void main(String[] args) {
        new Board();
    }

    public Board(){
        StdDraw.setCanvasSize(1600,900);
        StdDraw.clear(Color.GREEN);
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.point(0.5, 0.2);
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.line(0.2, 0.5, 0.8, 0.5);
        StdDraw.show();

    }



}