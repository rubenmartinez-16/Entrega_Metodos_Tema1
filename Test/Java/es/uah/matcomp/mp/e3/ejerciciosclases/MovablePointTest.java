package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint point = new MovablePoint();
    MovablePoint point2 = new MovablePoint(23,50);


    @Test
    public void testDefaultConstructor() {
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
        assertEquals(0, point.getXSpeed());
        assertEquals(0, point.getYSpeed());
    }

    @Test
    public void testParameterizedConstructor() {
        point = new MovablePoint(2.5f, 3.5f, 1.5f, 2.5f);
        assertEquals(2.5f, point.getX());
        assertEquals(3.5f, point.getY());
        assertEquals(1.5f, point.getXSpeed());
        assertEquals(2.5f, point.getYSpeed());
    }

    @Test
    public void testSetXSpeed() {
        point.setXSpeed(4.0f);
        assertEquals(4.0f, point.getXSpeed());
    }

    @Test
    public void testSetYSpeed() {
        point.setYSpeed(5.0f);
        assertEquals(5.0f, point.getYSpeed());
    }

    @Test
    public void testSetSpeed() {
        point.setSpeed(6.0f, 7.0f);
        assertEquals(6.0f, point.getXSpeed());
        assertEquals(7.0f, point.getYSpeed());
    }

    @Test
    public void testGetSpeed() {
        point.setSpeed(8.0f, 9.0f);
        float[] speeds = point.getSpeed();
        assertEquals(8.0f, speeds[0]);
        assertEquals(9.0f, speeds[1]);
    }

    @Test
    public void testMove() {
        point = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        point.move();
        assertEquals(3.0f, point.getX());
        assertEquals(4.5f, point.getY());
    }

    @Test
    public void testToString() {
        point = new MovablePoint(4.0f, 5.0f, 2.0f, 3.0f);
        assertEquals("(4.0, 5.0), speed=(2.0, 3.0)", point.toString());
    }
}