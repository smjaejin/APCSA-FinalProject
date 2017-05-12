package com.apcsa.golf;

import java.awt.*;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;

/**
 * Created by apcsaper5 on 5/4/17.
 */
public class Board extends JFrame implements MouseListener{


    public static void main(String[] args) {
        new Board();
    }

    public Board(){
        this.setSize(new Dimension(1600,900));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addMouseListener(this);



    }

    public void mousePressed(MouseEvent e){
        System.out.println("Mouse pressed");
    }

    public void mouseClicked(MouseEvent e){
        Point point1 = e.getLocationOnScreen();
        System.out.println(point1.getX()+ " " + point1.getY());

    }
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released; # of clicks: "
                + e.getClickCount());
    }
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }

}