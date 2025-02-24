package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PointTest {
    Point P1 = new Point(0,0);

    @Test
    void getX() {
        assertEquals(0,P1.getX());
    }

    @Test
    void getY() {
        assertEquals(0,P1.getY());
    }

    @Test
    void setX() {
        P1.setX(2);
        assertEquals(2,P1.getX());
    }

    @Test
    void setY() {
        P1.setY(3);
        assertEquals(3,P1.getY());
    }

    @Test
    void setXY() {
        P1.setXY(1,2);
        assertEquals(1,P1.getX());
        assertEquals(2,P1.getY());
    }

    @Test
    void testToString() {
        assertEquals("Point: (0,0)",P1.toString());
    }
}