package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {
    MovableCircle mc = new MovableCircle(2,5,3,4,6);
    @Test
    void testToString() {
        assertEquals("(2,5) speed=(3,4),radius=6",mc.toString());
    }

    @Test
    void moveUp() {
        mc.moveUp();
        assertEquals("(2,9) speed=(3,4),radius=6",mc.toString());
    }

    @Test
    void moveDown() {
        mc.moveDown();
        assertEquals("(2,1) speed=(3,4),radius=6",mc.toString());
    }

    @Test
    void moveLeft() {
        mc.moveLeft();
        assertEquals("(-1,5) speed=(3,4),radius=6",mc.toString());
    }

    @Test
    void moveRight() {
        mc.moveRight();
        assertEquals("(5,5) speed=(3,4),radius=6",mc.toString());
    }
}