package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {
    MyPoint P1 = new MyPoint(49,25);

    @Test
    void getX() {
        assertEquals(49,P1.getX());
    }

    @Test
    void setX() {
        MyPoint Pc = new MyPoint();
        Pc.setX(20);
        assertEquals(20,Pc.getX());
    }

    @Test
    void getY() {
        assertEquals(25,P1.getY());
    }

    @Test
    void setY() {
        MyPoint Pc = new MyPoint();
        Pc.setY(20);
        assertEquals(20,Pc.getY());
    }

    @Test
    void getXY() {
        assertArrayEquals(new int[]{49, 25},P1.getXY());
    }

    @Test
    void setXY() {
        P1.setXY(20, 25);
        assertArrayEquals(new int[]{20,25},P1.getXY());
    }

    @Test
    void testToString() {
        assertEquals("(49,25)",P1.toString());
    }

    @Test
    void distance() {
        assertEquals(Math.sqrt(3620),P1.distance(65,83));
    }

    @Test
    void testDistance() {
        MyPoint P2 = new MyPoint(65,83);
        assertEquals(Math.sqrt(3620),P1.distance(P2));

    }

    @Test
    void testDistance1() {
        assertEquals(Math.sqrt(49*49+25*25),P1.distance());
    }
}