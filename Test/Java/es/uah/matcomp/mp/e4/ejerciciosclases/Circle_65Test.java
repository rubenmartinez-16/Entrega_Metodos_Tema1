package es.uah.matcomp.mp.e4.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle_65Test {
    @Test
    void GetArea() {
        Circle_I circle = new Circle_I(2.0);
        assertEquals(Math.PI * 4, circle.getArea(), 0.0001);
    }

    @Test
    void GetPerimeter() {
        Circle_I circle = new Circle_I(2.0);
        assertEquals(2 * Math.PI * 2, circle.getPerimeter(), 0.0001);
    }

    @Test
    void ToString() {
        Circle_I circle = new Circle_I(2.0);
        assertEquals("Circle[radius=2.0]", circle.toString());
    }
}