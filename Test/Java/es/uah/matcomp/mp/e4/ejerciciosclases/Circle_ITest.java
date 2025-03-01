package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle_ITest {
    @Test
    void testGetArea() {
        Circle_I circle = new Circle_I(2.0);
        assertEquals(Math.PI * 4, circle.getArea(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        Circle_I circle = new Circle_I(2.0);
        assertEquals(2 * Math.PI * 2, circle.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Circle_I circle = new Circle_I(2.0);
        assertEquals("Circle[radius=2.0]", circle.toString());
    }
}