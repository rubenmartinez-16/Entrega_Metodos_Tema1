package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle_ITest {

    @Test
    void testGetArea() {
        Rectangle_I rectangle = new Rectangle_I(3.0, 4.0);
        assertEquals(12.0, rectangle.getArea(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        Rectangle_I rectangle = new Rectangle_I(3.0, 4.0);
        assertEquals(14.0, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Rectangle_I rectangle = new Rectangle_I(3.0, 4.0);
        assertEquals("Rectangle[width=3.0, length=4.0]", rectangle.toString());
    }
}