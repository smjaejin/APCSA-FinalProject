package com.apcsa.golf;

/**
 * Created by apcsaper5 on 5/12/17.
 */
public class Application {
    public static void main(String[] args) {
        new Board();
        Ball b = new Ball();
        b.move();
    }
}
