package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParticleTest {

    @Test
    void createParticleWithDefaultValues() {
        Particle particleDefault = new ParticleBuilder().build();
        assertEquals(0, particleDefault.getX());
        assertEquals(0, particleDefault.getY());
        assertEquals(0, particleDefault.getxVelocity());
        assertEquals(0, particleDefault.getyVelocity());
    }

    @Test
    void createParticleWithAllValuesEqual1() {
        Particle particleOne = new ParticleBuilder()
                .x(1).y(1).xVelocity(1).yVelocity(1).build();
        assertEquals(1, particleOne.getX());
        assertEquals(1, particleOne.getY());
        assertEquals(1, particleOne.getxVelocity());
        assertEquals(1, particleOne.getyVelocity());
    }

    @Test
    void changeParticleValues() {
        Particle particleDefault = new ParticleBuilder().build();
        particleDefault.setxVelocity(1);
        assertEquals(1, particleDefault.getxVelocity());

    }
}