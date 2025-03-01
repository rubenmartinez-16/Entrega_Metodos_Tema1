package es.uah.matcomp.mp.e3.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle_ShapeTest {
    Circle_Shape c1 = new Circle_Shape(5);
    Circle_Shape c2 = new Circle_Shape(5,"Blue",true);
    Circle_Shape c3 = new Circle_Shape();
    @Test
    void getRadius() {

        assertEquals(5, c2.getRadius());
    }

    @Test
    void setRadius() {
        c3.setRadius(10);
        assertEquals(10, c3.getRadius());
    }

    @Test
    void getPerimeter() {
        assertEquals(2 * Math.PI*5, c1.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI*25, c1.getArea());
    }

    @Test
    void testToString() {
        assertEquals("Circle[Shape [color=Red, filled=true]] radius=5.0]", c1.toString());

    }
}