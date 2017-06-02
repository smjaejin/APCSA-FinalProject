package com.apcsa.golf;

import edu.princeton.cs.introcs.StdDraw;

/**
 * Created by apcsaper5 on 5/31/17.
 */
public class ZoomZoomPad extends Wall {
        public double x1, y1, halfWidth, halfHeight;

        public ZoomZoomPad(double x1, double y1, double halfWidth, double halfHeight) {
            super(x1,y1,halfWidth, halfHeight);
        }

        void interact(Ball b) {
            if (checkInside(b)) {
                b.setMotionY(b.getMotionY() * 1.255);//may need to change boost based on size of pad
                b.setMotionX(b.getMotionX() * 1.255);
            }
        }
    }

