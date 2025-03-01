package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r = new Rectangle(10,20);
    Rectangle r2 = new Rectangle();
    Rectangle r3 = new Rectangle(10,20,"Red",true);

    @Test
    void getWidth() {
        assertEquals(10,r.getWidth());
    }

    @Test
    void setWidth() {
        r.setWidth(11);
        assertEquals(11,r.getWidth());
    }

    @Test
    void getLength() {
        assertEquals(20,r.getLength());
    }

    @Test
    void setLength() {
        r.setLength(10);
        assertEquals(10,r.getLength());
    }

    @Test
    void getArea() {
        assertEquals(200,r.getArea());

    }

    @Test
    void getPerimeter() {
        assertEquals(60,r.getPerimeter());
    }

    @Test
    void testToString() {
        assertEquals("Rectangle[Shape[Shape [color=Red, filled=true]width=10.0, length=20.0]]", r.toString());
    }
}