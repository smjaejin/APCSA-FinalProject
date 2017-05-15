package com.apcsa.golf;

import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by apcsaper5 on 5/12/17.
 */
public class MouseTracker implements MouseInputListener{

    public MouseTracker(){



    }


    public void mousePressed(MouseEvent e){
        System.out.println("Mouse pressed");
    }

    public void mouseClicked(MouseEvent e){}

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


    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse dragged");
    }


    public void mouseMoved(MouseEvent e) {}
}
