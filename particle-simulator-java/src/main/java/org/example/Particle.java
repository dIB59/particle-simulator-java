package org.example;

public class Particle {

    private double x;
    private double y;
    private double xVelocity;
    private double yVelocity;
    private final int mass;
    private final int radius;

    public Particle(double x, double y, double xVelocity, double yVelocity, int mass, int radius) {
        this.x = x;
        this.y = y;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.mass = mass;
        this.radius = radius;
    }

    public double getY() {
        return y;
    }

    public double getxVelocity() {
        return xVelocity;
    }

    public double getyVelocity() {
        return yVelocity;
    }

    public int getMass() {
        return mass;
    }

    public int getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setxVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }
}
