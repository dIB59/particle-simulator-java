package org.example.game;

import playn.java.LWJGLPlatform;

public class HelloGameJava {
    public static void main(String[] args) {
        LWJGLPlatform plat = new LWJGLPlatform(new LWJGLPlatform.Config());
        new HelloGame(plat);
        plat.start();
    }
}
