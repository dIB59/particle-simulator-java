package org.example.game;

import playn.java.LWJGLPlatform;

public class ParticleGameJava {
    public static void main(String[] args) {
        LWJGLPlatform plat = new LWJGLPlatform(new LWJGLPlatform.Config());
        new ParticleGame(plat);
        plat.start();
    }
}
