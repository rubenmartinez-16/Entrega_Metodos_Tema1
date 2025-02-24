package es.uah.matcomp.mp.e2.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {
    MyPoint C = new MyPoint(2, 3);
    MyCircle c1 = new MyCircle();
    MyCircle c2 = new MyCircle(C,3);
    MyCircle c3 = new MyCircle(4,7,4);

    @Test
    void getRadius() {
        assertEquals(4, c3.getRadius());
    }

    @Test
    void setRadius() {
        c1.setRadius(5);
        assertEquals(5, c1.getRadius());
    }

    @Test
    void getCenter() {
        assertEquals(C, c2.getCenter());
    }

    @Test
    void setCenter() {
        c1.setCenter(C);
        assertEquals(C, c1.getCenter());
    }

    @Test
    void getCenterX() {
        assertEquals(4, c3.getCenterX());
    }

    @Test
    void getCenterY() {
        assertEquals(7, c3.getCenterY());
    }

    @Test
    void setCenterX() {
        c1.setCenterX(1);
        assertEquals(1, c1.getCenterX());
    }

    @Test
    void setCenterY() {
        c1.setCenterY(2);
        assertEquals(2, c1.getCenterY());
    }

    @Test
    void getCenterXY() {
        assertArrayEquals(new int[]{4,7}, c3.getCenterXY());
    }

    @Test
    void setCenterXY() {
        c1.setCenterXY(3,4);
        assertArrayEquals(new int[]{3,4}, c1.getCenterXY());

    }

    @Test
    void testToString() {
        assertEquals("MyCircle[radius = 3,center = (2,3) ]",c2.toString());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI*3*3, c2.getArea());
    }

    @Test
    void getCircumference() {
        assertEquals(Math.PI*2*4, c3.getCircumference());
    }

    @Test
    void getDistance() {
        assertEquals(Math.sqrt(20), c2.getDistance(c3));
    }
}