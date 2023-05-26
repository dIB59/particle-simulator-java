package org.example;

public class ParticleBuilder {

    private double x = 0;
    private double y = 0;
    private double xVelocity = 0;
    private double yVelocity = 0;

    public ParticleBuilder x(double x) {
        this.x = x;
        return this;
    }

    public ParticleBuilder y(double y) {
        this.y = y;
        return this;
    }

    public ParticleBuilder xVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
        return this;
    }

    public ParticleBuilder yVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
        return this;
    }

    public Particle build() {
        int radius = 1;
        int mass = 1;
        return new Particle(x, y, xVelocity, yVelocity, mass, radius);
    }

}
