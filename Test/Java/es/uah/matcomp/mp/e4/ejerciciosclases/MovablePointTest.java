package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint mp = new MovablePoint(0,0,4,6);
    @Test
    void testToString() {
        assertEquals("(0,0) speed=(4,6)",mp.toString());

    }

    @Test
    void moveDown() {
        mp.moveDown();
        assertEquals("(0,-6) speed=(4,6)",mp.toString());
    }

    @Test
    void moveUp() {
        mp.moveUp();
        assertEquals("(0,6) speed=(4,6)",mp.toString());
    }

    @Test
    void moveLeft() {
        mp.moveLeft();
        assertEquals("(-4,0) speed=(4,6)",mp.toString());
    }

    @Test
    void moveRight() {
        mp.moveRight();
        assertEquals("(4,0) speed=(4,6)",mp.toString());
    }
}