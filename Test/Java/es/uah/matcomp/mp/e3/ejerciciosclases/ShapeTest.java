package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Shape shape = new Shape("Black",false);
    Shape shape2 = new Shape();
    @Test
    void getColor() {
        assertEquals("Red", shape2.getColor());

    }

    @Test
    void setColor() {
        shape.setColor("Blue");
        assertEquals("Blue", shape.getColor());
    }

    @Test
    void ifFilled() {
        assertEquals(true, shape2.ifFilled());
    }

    @Test
    void setFilled() {
        shape.setFilled(true);
        assertEquals(true, shape.ifFilled());
    }

    @Test
    void testToString() {
        assertEquals("Shape [color=Red, filled=true]", shape2.toString());
    }
}