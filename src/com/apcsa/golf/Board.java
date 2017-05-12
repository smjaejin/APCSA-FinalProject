package com.apcsa.golf;

import java.awt.*;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;

/**
 * Created by apcsaper5 on 5/4/17.
 */
public class Board extends JFrame{

    MouseTracker mouse;

    public static void main(String[] args) {
        new Board();
    }

    public Board(){
        this.setSize(new Dimension(1600,900));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouse = new MouseTracker();
        this.addMouseListener(mouse);
        this.addMouseMotionListener(mouse);

    }



}