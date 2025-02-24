package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LineSubTest extends PointTest {
    Point P2 = new Point(1, 2);
    LineSub l1 = new LineSub(super.P1,P2);
    LineSub l2 = new LineSub(super.P1.getX(),super.P1.getY(),1,2);

    @Test
    void testToString() {
        assertEquals("Line: [Begin = Point: (0,0), End = Point: (1,2) ]",l2.toString());
        assertEquals("Line: [Begin = Point: (0,0), End = Point: (1,2) ]",l1.toString());
    }

    @Test
    void getBegin() {
        assertEquals(super.P1.toString(),l1.getBegin().toString());
    }

    @Test
    void getEnd() {
        assertEquals(P2,l1.getEnd());
    }

    @Test
    void setBegin() {
        l1.setBegin(P2);
        assertEquals(P2.getX(),l1.getBeginX());
        assertEquals(P2.getY(),l1.getBeginY());
    }

    @Test
    void setEnd() {
        l1.setEnd(P1);
        assertEquals(P1.getX(),l1.getEndX());
        assertEquals(P1.getY(),l1.getEndY());
    }

    @Test
    void getBeginX() {
        assertEquals(super.P1.getX(),l1.getBeginX());
    }

    @Test
    void getBeginY() {
        assertEquals(super.P1.getY(),l1.getBeginY());
    }

    @Test
    void getEndX() {
        assertEquals(P2.getX(),l2.getEndX());
    }

    @Test
    void getEndY() {
        assertEquals(P2.getY(),l2.getEndY());
    }

    @Test
    void setBeginX() {
        l1.setBeginX(5);
        assertEquals(5,l1.getBeginX());
    }

    @Test
    void setBeginY() {
        l1.setBeginY(7);
        assertEquals(7,l1.getBeginY());
    }

    @Test
    void setBeginXY() {
        l1.setBeginXY(5,7);
        assertEquals(5,l1.getBeginX());
        assertEquals(7,l1.getBeginY());
    }

    @Test
    void setEndX() {
        l1.setEndX(5);
        assertEquals(5,l1.getEndX());
    }

    @Test
    void setEndY() {
        l1.setEndY(7);
        assertEquals(7,l1.getEndY());
    }

    @Test
    void setEndXY() {
        l1.setEndXY(5,7);
        assertEquals(5,l1.getEndX());
        assertEquals(7,l1.getEndY());
    }

    @Test
    void getLength() {
        assertEquals((int)Math.sqrt(5),l1.getLength());
        LineSub l3 = new LineSub(0,0,2,2);
        assertEquals(3,l3.getLength());
    }

    @Test
    void getGradient() {
        assertEquals(Math.atan(2),l1.getGradient());
    }
}