package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {
    MyPoint Pb = new MyPoint(1,1);
    MyPoint Pe = new MyPoint(2,2);
    MyLine l2 = new MyLine(Pb,Pe);
    MyLine l1 = new MyLine(1,1,2,2);

    @Test
    void getBegin() {
        MyPoint p1 = new MyPoint(1,1);
        assertEquals(1,l1.getBegin().getX());
        assertEquals(1,l1.getBegin().getY());
    }

    @Test
    void getEnd() {
        MyPoint p2 = new MyPoint(2,2);
        assertEquals(2,l1.getEnd().getX());
        assertEquals(2,l1.getEnd().getY());
    }

    @Test
    void setBegin() {
        MyPoint p3 = new MyPoint(3,3);
        l1.setBegin(p3);
        assertEquals(p3 ,l1.getBegin());
    }

    @Test
    void setEnd() {
        MyPoint p4 = new MyPoint(4,4);
        l1.setEnd(p4);
        assertEquals(p4 ,l1.getEnd());
    }

    @Test
    void getBeginX() {
        assertEquals(1,l1.getBeginX());
    }

    @Test
    void getBeginY() {
        assertEquals(1,l1.getBeginY());
    }

    @Test
    void getEndX() {
        assertEquals(2,l1.getEndX());
    }

    @Test
    void getEndY() {
        assertEquals(2,l1.getEndY());
    }

    @Test
    void setBeginX() {
        l1.setBeginX(3);
        assertEquals(3,l1.getBeginX());

    }

    @Test
    void setBeginY() {
        l1.setBeginY(4);
        assertEquals(4,l1.getBeginY());
    }

    @Test
    void setEndX() {
        l2.setEndX(5);
        assertEquals(5,l2.getEndX());
    }

    @Test
    void setEndY() {
        l2.setEndY(6);
        assertEquals(6,l2.getEndY());
    }

    @Test
    void getBeginXY() {
        assertArrayEquals(new int[]{1,1},l1.getBeginXY());
    }

    @Test
    void getEndXY() {
        assertArrayEquals(new int[]{2,2},l1.getEndXY());
    }

    @Test
    void setBeginXY() {
        l1.setBeginXY(3,4);
        assertArrayEquals(new int[]{3,4},l1.getBeginXY());
    }

    @Test
    void setEndXY() {
        l1.setEndXY(5,6);
        assertArrayEquals(new int[]{5,6},l1.getEndXY());
    }

    @Test
    void getLength() {
        assertEquals(Math.sqrt(2),l1.getLength());
    }

    @Test
    void getGradient() {
        assertEquals(Math.atan(1),l1.getGradient());
    }
}